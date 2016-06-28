import android.database.CursorWindow;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

public class ehn
  implements fnp
{
  private DataHolder a;
  private int b;
  private int c;
  
  public ehn(DataHolder paramDataHolder, int paramInt)
  {
    this.a = ((DataHolder)efj.a(paramDataHolder));
    if ((paramInt >= 0) && (paramInt < this.a.g)) {}
    for (int i = 1; i == 0; i = 0) {
      throw new IllegalStateException();
    }
    this.b = paramInt;
    this.c = this.a.a(this.b);
  }
  
  public ehn(DataHolder paramDataHolder, int paramInt, byte paramByte)
  {
    this(paramDataHolder, paramInt);
  }
  
  public final long a(String paramString)
  {
    DataHolder localDataHolder = this.a;
    int i = this.b;
    int j = this.c;
    localDataHolder.a(paramString, i);
    return localDataHolder.d[j].getLong(i, localDataHolder.c.getInt(paramString));
  }
  
  public String a()
  {
    return d("account_name");
  }
  
  public final int b(String paramString)
  {
    DataHolder localDataHolder = this.a;
    int i = this.b;
    int j = this.c;
    localDataHolder.a(paramString, i);
    return localDataHolder.d[j].getInt(i, localDataHolder.c.getInt(paramString));
  }
  
  public boolean b()
  {
    return c("sync_to_contacts");
  }
  
  public final boolean c(String paramString)
  {
    DataHolder localDataHolder = this.a;
    int i = this.b;
    int j = this.c;
    localDataHolder.a(paramString, i);
    return Long.valueOf(localDataHolder.d[j].getLong(i, localDataHolder.c.getInt(paramString))).longValue() == 1L;
  }
  
  public final String d(String paramString)
  {
    DataHolder localDataHolder = this.a;
    int i = this.b;
    int j = this.c;
    localDataHolder.a(paramString, i);
    return localDataHolder.d[j].getString(i, localDataHolder.c.getInt(paramString));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof ehn;
    boolean bool2 = false;
    if (bool1)
    {
      ehn localehn = (ehn)paramObject;
      boolean bool3 = efj.a(Integer.valueOf(localehn.b), Integer.valueOf(this.b));
      bool2 = false;
      if (bool3)
      {
        boolean bool4 = efj.a(Integer.valueOf(localehn.c), Integer.valueOf(this.c));
        bool2 = false;
        if (bool4)
        {
          DataHolder localDataHolder1 = localehn.a;
          DataHolder localDataHolder2 = this.a;
          bool2 = false;
          if (localDataHolder1 == localDataHolder2) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.b);
    arrayOfObject[1] = Integer.valueOf(this.c);
    arrayOfObject[2] = this.a;
    return Arrays.hashCode(arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ehn
 * JD-Core Version:    0.7.0.1
 */