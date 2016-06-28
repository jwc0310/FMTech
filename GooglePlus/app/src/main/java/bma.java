import android.content.Context;
import android.util.JsonReader;
import android.util.Log;
import java.io.StringReader;
import java.nio.ByteBuffer;

public final class bma
  extends kbw
{
  public int a;
  public String b;
  
  public bma(Context paramContext, kcg paramkcg, String paramString)
  {
    super(paramContext, paramkcg, "POST", new kda(paramContext, paramkcg.a, "sj"), paramString, null);
  }
  
  public final void a(ByteBuffer paramByteBuffer, String paramString)
  {
    String str1 = null;
    String str2 = new String(efj.a(paramByteBuffer));
    c(paramByteBuffer, str2);
    JsonReader localJsonReader;
    int i;
    if (Log.isLoggable("HttpOperation", 3))
    {
      String str4 = String.valueOf(str2);
      if (str4.length() != 0) {
        "Received server response: ".concat(str4);
      }
    }
    else
    {
      localJsonReader = new JsonReader(new StringReader(str2));
      localJsonReader.beginObject();
      i = 0;
    }
    for (;;)
    {
      if (!localJsonReader.hasNext()) {
        break label180;
      }
      String str3 = localJsonReader.nextName();
      if (str3.equals("durationMillis"))
      {
        i = localJsonReader.nextInt();
        continue;
        new String("Received server response: ");
        break;
      }
      if (str3.equals("playType")) {
        str1 = localJsonReader.nextString().toLowerCase();
      } else if (str3.equals("url")) {
        this.b = localJsonReader.nextString();
      } else {
        localJsonReader.skipValue();
      }
    }
    label180:
    localJsonReader.endObject();
    if ((str1 == null) || (str1.equals("full")) || (!str1.endsWith("sp"))) {}
    for (this.a = i;; this.a = (1000 * Integer.parseInt(str1.substring(0, -2 + str1.length()))))
    {
      if (Log.isLoggable("HttpOperation", 3))
      {
        int j = this.a;
        new StringBuilder(41).append("Total playable time set to ").append(j).append(" ms");
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bma
 * JD-Core Version:    0.7.0.1
 */