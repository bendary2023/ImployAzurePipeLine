import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.function.Function;
import java.util.function.Supplier;

public class ProperityFiles {

    public Function<String, Properties > getProperities=(file)->{
        FileInputStream stream=null;
        Properties prop=null;
        try{
            stream=new FileInputStream(file);
            prop=new Properties();
            prop.load(stream);

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return prop;
    };
}
