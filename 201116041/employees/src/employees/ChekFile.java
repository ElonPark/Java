package employees;

import java.io.File;

public class ChekFile
{
    
    static boolean method(File file)
    {
            if(file.exists())
            {
                    if(file.isFile() && file.canWrite())
                    {
                            return true;
                    }
            }
            return false;
    }
}
