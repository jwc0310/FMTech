import android.content.Context;
import java.io.File;

public final class but
  extends bsr
{
  private static but b;
  
  private but(File paramFile)
  {
    super(paramFile);
  }
  
  public static but a(Context paramContext)
  {
    try
    {
      if (b == null) {
        b = new but(bsr.a(paramContext, "profile"));
      }
      but localbut = b;
      return localbut;
    }
    finally {}
  }
  
  private static String b(int paramInt, String paramString)
  {
    if (paramString == null) {
      return "bad_type";
    }
    switch (paramInt)
    {
    default: 
      return null;
    case 1: 
      String str5 = String.valueOf("people_in_common_");
      String str6 = String.valueOf(paramString);
      if (str6.length() != 0) {
        return str5.concat(str6);
      }
      return new String(str5);
    case 2: 
      String str3 = String.valueOf("visible_circle_members_");
      String str4 = String.valueOf(paramString);
      if (str4.length() != 0) {
        return str3.concat(str4);
      }
      return new String(str3);
    }
    String str1 = String.valueOf("owner_incoming_members_");
    String str2 = String.valueOf(paramString);
    if (str2.length() != 0) {
      return str1.concat(str2);
    }
    return new String(str1);
  }
  
  public final void a(int paramInt, String paramString)
  {
    String str = b(paramInt, paramString);
    File localFile = new File(this.a, str);
    if (localFile.exists()) {
      localFile.delete();
    }
  }
  
  public final void a(int paramInt, String paramString, qat paramqat)
  {
    a(b(paramInt, paramString), qat.a(paramqat));
  }
  
  public final byte[] a(int paramInt, String paramString, long paramLong)
  {
    return super.a(b(paramInt, paramString), paramLong);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     but
 * JD-Core Version:    0.7.0.1
 */