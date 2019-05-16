package utility;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.Company;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.List;
import pojo.Stock;


public class FileHelper {

    public static final SimpleDateFormat DATEFORMAT = new SimpleDateFormat("MM-dd-yyyy");
    private static final ObjectMapper mapper = new ObjectMapper();


    public static List<Company> readCompanies(String fileName) throws IOException {

        InputStream inputStream = new FileInputStream(("src/main/resources/data" + File.separatorChar + fileName));
//        InputStream resourceAsStream = FileHelper.class.getClassLoader().getResourceAsStream(fileName);
        return mapper.readValue(inputStream, new TypeReference<List<Company>>() {});
    }

    public static List<Stock> readStocks(String fileName) throws IOException {

        InputStream inputStream = new FileInputStream(("src/main/resources/data" + File.separatorChar + fileName));
//        InputStream resourceAsStream = FileHelper.class.getClassLoader().getResourceAsStream(fileName);
        return mapper.readValue(inputStream, new TypeReference<List<Stock>>() {});
    }

}
