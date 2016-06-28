import java.io.Serializable;

final class rfx
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  final String a;
  final rfo b;
  final rfs c;
  final rfs d;
  
  public rfx(String paramString, rfo paramrfo, rfs paramrfs1, rfs paramrfs2)
  {
    this.a = paramString;
    this.b = paramrfo;
    this.c = paramrfs1;
    this.d = paramrfs2;
  }
  
  @Deprecated
  public final int hashCode()
  {
    return this.a.hashCode() ^ this.b.hashCode();
  }
  
  public final String toString()
  {
    String str1 = this.a;
    String str2 = String.valueOf(this.b.toString());
    String str4;
    String str6;
    if (this.c == null)
    {
      str4 = "";
      if (this.d != null) {
        break label150;
      }
      str6 = "";
    }
    for (;;)
    {
      return 2 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str4).length() + String.valueOf(str6).length() + str1 + ": " + str2 + str4 + str6;
      String str3 = String.valueOf(this.c.toString());
      if (str3.length() != 0)
      {
        str4 = " ".concat(str3);
        break;
      }
      str4 = new String(" ");
      break;
      label150:
      String str5 = String.valueOf(this.d.toString());
      if (str5.length() != 0) {
        str6 = " ".concat(str5);
      } else {
        str6 = new String(" ");
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rfx
 * JD-Core Version:    0.7.0.1
 */