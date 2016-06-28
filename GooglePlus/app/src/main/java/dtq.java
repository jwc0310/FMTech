import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.format.DateUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class dtq
  extends mab
{
  String a;
  String b;
  String c;
  String d = "";
  String e;
  int f;
  
  dtq() {}
  
  public dtq(Context paramContext, qef paramqef, String paramString)
  {
    String str1;
    Object localObject;
    SimpleDateFormat localSimpleDateFormat;
    if (paramqef.c != null)
    {
      str1 = paramqef.c;
      this.a = str1;
      if ((paramqef.d != null) && (paramqef.d.length > 0)) {
        this.b = ((qdl)paramqef.d[0].b(qdl.a)).c;
      }
      this.c = paramString;
      localObject = "";
      if (paramqef.e != null) {
        localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
      }
    }
    try
    {
      Date localDate = localSimpleDateFormat.parse(paramqef.e);
      Calendar localCalendar = Calendar.getInstance();
      localCalendar.setTime(localDate);
      long l = localCalendar.getTimeInMillis();
      if (localCalendar.get(1) != Calendar.getInstance().get(1)) {
        break label382;
      }
      j = 65560;
      label143:
      String str8 = DateUtils.formatDateTime(paramContext, l, j);
      localObject = str8;
    }
    catch (ParseException localParseException)
    {
      int j;
      label157:
      String str2;
      String str7;
      Object[] arrayOfObject2;
      String str3;
      String str6;
      Object[] arrayOfObject1;
      String str4;
      String str5;
      int i;
      break label157;
    }
    str2 = "";
    if (paramqef.f != null)
    {
      str7 = paramContext.getResources().getQuantityString(efj.BN, paramqef.f.intValue());
      arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = paramqef.f;
      str2 = String.format(str7, arrayOfObject2);
    }
    str3 = "";
    if (paramqef.g != null)
    {
      str6 = paramContext.getResources().getQuantityString(efj.BO, paramqef.g.intValue());
      arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = paramqef.g;
      str3 = String.format(str6, arrayOfObject1);
    }
    this.e = paramqef.b;
    this.d = (0 + String.valueOf(localObject).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + (String)localObject + str2 + str3);
    if (paramqef.h != null)
    {
      str4 = String.valueOf(paramqef.h);
      if (str4.length() != 0) {
        str5 = "#".concat(str4);
      }
    }
    label361:
    for (i = Color.parseColor(str5);; i = 0)
    {
      this.f = i;
      return;
      str1 = "";
      break;
      label382:
      j = 65552;
      break label143;
      str5 = new String("#");
      break label361;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dtq
 * JD-Core Version:    0.7.0.1
 */