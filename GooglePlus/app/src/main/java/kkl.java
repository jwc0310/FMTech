import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class kkl
  implements iyn<kkc>
{
  private Context a;
  
  public kkl(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private static boolean a(byte[] paramArrayOfByte)
  {
    DataInputStream localDataInputStream = new DataInputStream(new ByteArrayInputStream(paramArrayOfByte));
    try
    {
      boolean bool = localDataInputStream.readUTF().endsWith("_v1");
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  private final kkc b(int paramInt, byte[] paramArrayOfByte)
  {
    koj localkoj = new koj();
    try
    {
      qat.b(localkoj, paramArrayOfByte, 0, paramArrayOfByte.length);
      return new kkc(this.a, paramInt, localkoj);
    }
    catch (qas localqas)
    {
      throw new IOException(localqas);
    }
  }
  
  private final kkc c(int paramInt, byte[] paramArrayOfByte)
  {
    int i = 0;
    DataInputStream localDataInputStream = new DataInputStream(new ByteArrayInputStream(paramArrayOfByte));
    String str1 = localDataInputStream.readUTF();
    if (Log.isLoggable("NetworkPostSerializer", 4))
    {
      String str5 = String.valueOf(str1);
      if (str5.length() == 0) {
        break label169;
      }
      "Restoring:".concat(str5);
    }
    long l;
    String str2;
    byte[] arrayOfByte;
    String str3;
    for (;;)
    {
      l = localDataInputStream.readLong();
      str2 = localDataInputStream.readUTF();
      arrayOfByte = new byte[localDataInputStream.readInt()];
      localDataInputStream.readFully(arrayOfByte);
      str3 = localDataInputStream.readUTF();
      int j = localDataInputStream.readInt();
      if (j <= 0) {
        break;
      }
      localArrayList = new ArrayList(j);
      while (i < j)
      {
        ipm localipm = ipm.a(localDataInputStream.readInt());
        String str4 = localDataInputStream.readUTF();
        localArrayList.add(ipf.a(this.a, Uri.parse(str4), localipm));
        i++;
      }
      label169:
      new String("Restoring:");
    }
    ArrayList localArrayList = null;
    try
    {
      myt localmyt = (myt)qat.b(new myt(), arrayOfByte, 0, arrayOfByte.length);
      kkc localkkc = new kkc(this.a, paramInt, localmyt, new Date(l), str2, localArrayList);
      if (!TextUtils.isEmpty(str3)) {
        localkkc.a.d = str3;
      }
      return localkkc;
    }
    catch (qas localqas)
    {
      Log.e("NetworkPostSerializer", "Error merging PostActivityRequest from post bytes. Removing item file and skipping item.", localqas);
    }
    return null;
  }
  
  public final String a()
  {
    return "network_post_request_handle";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kkl
 * JD-Core Version:    0.7.0.1
 */