import android.content.ContentResolver;
import android.database.AbstractCursor;
import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;

@Deprecated
public final class jlz
  extends AbstractCursor
{
  private static String[] a = { "_id", "circle_id", "circle_name", "sort_key", "type", "semantic_hints", "contact_count", "for_sharing" };
  private static int[] b = { 3, 3, 3, 3, 1, 1, 1, 1 };
  private final List<jgw> c;
  
  public jlz(List<jgw> paramList)
  {
    this.c = paramList;
  }
  
  public final void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
    throw new UnsupportedOperationException();
  }
  
  public final int getColumnCount()
  {
    return a.length;
  }
  
  public final int getColumnIndexOrThrow(String paramString)
  {
    int i = getColumnIndex(paramString);
    if (i == -1) {
      throw new IllegalArgumentException(String.format("Column %s does not exist", new Object[] { paramString }));
    }
    return i;
  }
  
  public final String getColumnName(int paramInt)
  {
    return a[paramInt];
  }
  
  public final String[] getColumnNames()
  {
    return a;
  }
  
  public final int getCount()
  {
    return this.c.size();
  }
  
  public final double getDouble(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public final Bundle getExtras()
  {
    throw new UnsupportedOperationException();
  }
  
  public final float getFloat(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public final int getInt(int paramInt)
  {
    int i = getPosition();
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException();
    case 4: 
      return ((jgw)this.c.get(i)).e();
    case 6: 
      return ((jgw)this.c.get(i)).f();
    case 5: 
      return ((jgw)this.c.get(i)).g();
    }
    if (((jgw)this.c.get(i)).h()) {
      return 1;
    }
    return 0;
  }
  
  public final long getLong(int paramInt)
  {
    int i = getPosition();
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException();
    }
    return ((jgw)this.c.get(i)).a();
  }
  
  public final Uri getNotificationUri()
  {
    throw new UnsupportedOperationException();
  }
  
  public final short getShort(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public final String getString(int paramInt)
  {
    int i = getPosition();
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException();
    case 1: 
      return ((jgw)this.c.get(i)).b();
    case 2: 
      return ((jgw)this.c.get(i)).c();
    case 3: 
      return ((jgw)this.c.get(i)).d();
    }
    return String.valueOf(((jgw)this.c.get(i)).a());
  }
  
  public final int getType(int paramInt)
  {
    return b[paramInt];
  }
  
  public final boolean isNull(int paramInt)
  {
    return false;
  }
  
  public final Bundle respond(Bundle paramBundle)
  {
    throw new UnsupportedOperationException();
  }
  
  public final void setNotificationUri(ContentResolver paramContentResolver, Uri paramUri)
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jlz
 * JD-Core Version:    0.7.0.1
 */