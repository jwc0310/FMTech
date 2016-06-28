import android.content.ContentUris;
import android.content.Context;
import android.content.res.Resources;
import android.database.CursorWrapper;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Date;
import java.util.Map;

public final class dce
  extends CursorWrapper
{
  private static java.text.DateFormat a;
  private static java.text.DateFormat b;
  private Context c;
  private long d;
  private long e;
  private String f;
  private hra g;
  private Uri[] h;
  private boolean[] i;
  private final int j;
  private final int k;
  private final ivl l;
  private final dcf m = new dcf();
  
  public dce(Context paramContext, hra paramhra, int paramInt, ivl paramivl)
  {
    super(paramhra);
    this.c = paramContext;
    this.g = paramhra;
    this.d = jrf.c.longValue();
    this.e = 262144L;
    this.f = jrf.a();
    this.h = ((Uri[])paramhra.getExtras().getParcelableArray("media_uris"));
    this.i = paramhra.getExtras().getBooleanArray("media_is_video");
    this.j = paramInt;
    this.k = paramhra.getColumnIndexOrThrow("_id");
    this.l = paramivl;
    if (a == null)
    {
      a = android.text.format.DateFormat.getLongDateFormat(paramContext);
      b = android.text.format.DateFormat.getTimeFormat(paramContext);
    }
  }
  
  public final int getColumnCount()
  {
    return cyd.r.length;
  }
  
  public final String getColumnName(int paramInt)
  {
    return cyd.r[paramInt];
  }
  
  public final String[] getColumnNames()
  {
    return cyd.r;
  }
  
  public final int getInt(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      Log.e("EsTile", 61 + "LocalBestPhotosCursorWrapper#getInt - bad column: " + paramInt);
    case 9: 
      return 0;
    case 0: 
      return super.getInt(this.k);
    case 13: 
      return this.j + this.g.getPosition();
    }
    return 4;
  }
  
  public final long getLong(int paramInt)
  {
    long l1 = 0L;
    switch (paramInt)
    {
    default: 
      Log.e("EsTile", 62 + "LocalBestPhotosCursorWrapper#getLong - bad column: " + paramInt);
      return l1;
    case 0: 
      return super.getLong(this.k);
    case 15: 
      int n = this.g.b;
      if ((this.l != null) && (this.i[n] != 0) && (!TextUtils.isEmpty(this.g.getString(4)))) {
        this.l.e();
      }
      long l2 = this.e;
      if (this.i[n] != 0) {
        l1 = 32L;
      }
      return l1 | l2;
    case 14: 
      return this.d;
    }
    return this.g.getLong(1);
  }
  
  public final String getString(int paramInt)
  {
    dcf localdcf1 = this.m;
    int n = getPosition();
    dcg localdcg1 = localdcf1.b;
    localdcg1.a = n;
    localdcg1.b = paramInt;
    String str1 = (String)localdcf1.a.get(localdcf1.b);
    if (str1 == null) {
      switch (paramInt)
      {
      case 2: 
      case 6: 
      case 8: 
      case 9: 
      case 10: 
      case 11: 
      case 12: 
      case 13: 
      case 14: 
      case 15: 
      case 16: 
      default: 
        Log.e("EsTile", 64 + "LocalBestPhotosCursorWrapper#getString - bad column: " + paramInt);
        str1 = null;
      }
    }
    for (;;)
    {
      dcf localdcf2 = this.m;
      int i1 = getPosition();
      dcg localdcg2 = new dcg();
      localdcg2.a = i1;
      localdcg2.b = paramInt;
      localdcf2.a.put(localdcg2, str1);
      return str1;
      str1 = super.getString(this.k);
      continue;
      str1 = this.f;
      continue;
      if (this.g.isNull(3))
      {
        str1 = jrf.a();
      }
      else
      {
        str1 = jrf.k(String.valueOf(this.g.getInt(3)));
        continue;
        str1 = "~local";
        continue;
        int i2 = this.g.b;
        str1 = ContentUris.withAppendedId(this.h[i2], this.g.getLong(0)).toString();
        continue;
        str1 = efj.a(this.g.getString(5), this.g.getInt(6), this.g.getLong(2));
        continue;
        Date localDate = new Date(this.g.getLong(2));
        String str2 = this.c.getResources().getString(aau.ns);
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = a.format(localDate);
        arrayOfObject[1] = b.format(localDate);
        str1 = String.format(str2, arrayOfObject);
        continue;
        str1 = null;
      }
    }
  }
  
  public final boolean isNull(int paramInt)
  {
    switch (paramInt)
    {
    case 7: 
    case 9: 
    case 13: 
    case 14: 
    case 15: 
    case 16: 
    default: 
      return false;
    }
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dce
 * JD-Core Version:    0.7.0.1
 */