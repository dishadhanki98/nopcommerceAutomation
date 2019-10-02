package NopCommerce1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProp
{
    static Properties props;
    static FileInputStream inputStream;

    public String getProperty(String key)
    {
        props = new Properties();
        try
        {
            inputStream = new FileInputStream("src\\main\\Resources\\testDataConfig.Properties");

            try
            {
                props.load(inputStream);
                inputStream.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return props.getProperty(key);


    }


}
