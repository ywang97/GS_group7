package utility;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.List;


public class FileHelper {

    public static final SimpleDateFormat DATEFORMAT = new SimpleDateFormat("MM-dd-yyyy");
    private static final ObjectMapper mapper = new ObjectMapper();

    public static List<Company> readCompanies(String fileName) throws IOException {

        InputStream inputStream = new FileInputStream((".../resources/data" + File.separatorChar + fileName));
//        InputStream resourceAsStream = FileHelper.class.getClassLoader().getResourceAsStream(fileName);
        return mapper.readValue(inputStream, new TypeReference<List<Company>>() {
        });
    }

}
