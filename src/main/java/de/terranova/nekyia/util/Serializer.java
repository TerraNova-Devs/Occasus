package de.terranova.nekyia.util;

import java.io.*;
import java.util.Base64;

public class Serializer {

    public static Object FromString(String s) {
        Object o = null;
        try {
            byte[] data = Base64.getDecoder().decode(s);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            o = ois.readObject();
            ois.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return o;
    }

    public static String ToString( Serializable o ) {
        ByteArrayOutputStream baos = null;
        try {
            baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(o);
            oos.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        assert baos != null;
        return Base64.getEncoder().encodeToString(baos.toByteArray());
    }

}
