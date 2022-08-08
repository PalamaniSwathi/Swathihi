package onlinetest;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OnlineTest {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/anound";
        String username = "root";
        String password = "root";
        String excelFilePath = "C:\\Users\\swathi.palamani\\Downloads\\exam.xlsx";
        Connection connection = null;
        try {
            FileInputStream inputStream = new FileInputStream(excelFilePath);
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = firstSheet.iterator();
            connection = DriverManager.getConnection(jdbcURL, username, password);
            connection.setAutoCommit(false);
            String sql = "INSERT INTO online1 VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            int count = 0,count1=0;
            rowIterator.next(); // skip the header row
            while (rowIterator.hasNext()) {
                Row nextRow = rowIterator.next();
                Iterator<Cell> cellIterator = nextRow.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell nextCell = cellIterator.next();
                    int columnIndex = nextCell.getColumnIndex();
                    switch (columnIndex) {
                    case 0:
                        count1=count1+1;
                        statement.setInt(1, count1);
                        break;
                    case 1:
                    	String questions = nextCell.getStringCellValue();
                        statement.setString(2, questions);
                        break;
                    case 2:
                    	String A = nextCell.getStringCellValue();
                        statement.setString(3, A);
                        break;
                    case 3:
                    	String B = nextCell.getStringCellValue();
                        statement.setString(4, B);
                        break;
                    case 4:
                    	String C = nextCell.getStringCellValue();
                        statement.setString(5, C);
                        break;
                    case 5:
                    	String D = nextCell.getStringCellValue();
                        statement.setString(6, D);
                        break;
                    case 6:
                    	String ans = nextCell.getStringCellValue();
                        statement.setString(7, ans);
                    }
                }
                statement.addBatch();
                if (count % 100 == 0) {
                    statement.executeBatch();
                }
            }
            workbook.close();
            // execute the remaining queries
            statement.executeBatch();
            connection.commit();
            connection.close();
        } catch (IOException ex1) {
            System.out.println("Error reading file");
            ex1.printStackTrace();
        } catch (SQLException ex2) {
            System.out.println("Database error");
            ex2.printStackTrace();
        }
    }
}