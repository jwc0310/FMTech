import android.content.ContentResolver;
import android.database.AbstractCursor;
import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

@Deprecated
public final class jmd
  extends AbstractCursor
{
  public static final String[] a = { "_id", "person_id", "name", "sort_key", "interaction_sort_key", "avatar", "last_updated_time", "profile_type", "in_my_circles", "blocked", "verified", "gaia_id", "packed_circle_ids", "in_same_visibility_group" };
  private final List<jjg> b;
  
  public jmd(List<jjg> paramList)
  {
    this.b = paramList;
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
    return this.b.size();
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
    case 11: 
    case 12: 
    default: 
      throw new IllegalArgumentException();
    case 7: 
      return ((jjg)this.b.get(i)).h();
    case 8: 
      if (((jjg)this.b.get(i)).i().isEmpty()) {
        return 0;
      }
      return 1;
    case 9: 
      return 0;
    case 10: 
      if (((jjg)this.b.get(i)).m()) {
        return 1;
      }
      return 0;
    }
    if (((jjg)this.b.get(i)).k() == 2) {
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
    case 0: 
      return ((jjg)this.b.get(i)).b();
    }
    return ((jjg)this.b.get(i)).l();
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
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    default: 
      throw new IllegalArgumentException();
    case 0: 
      return String.valueOf(((jjg)this.b.get(i)).b());
    case 1: 
      return ((jjg)this.b.get(i)).a();
    case 2: 
      return ((jjg)this.b.get(i)).d();
    case 3: 
      return ((jjg)this.b.get(i)).f();
    case 4: 
      return ((jjg)this.b.get(i)).g();
    case 5: 
      return hdo.a(((jjg)this.b.get(i)).e());
    case 11: 
      return ((jjg)this.b.get(i)).c();
    }
    List localList = ((jjg)this.b.get(i)).i();
    if (localList == null) {
      return null;
    }
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      localStringBuffer.append(((jgw)localIterator.next()).b());
      localStringBuffer.append('|');
    }
    return localStringBuffer.toString();
  }
  
  public final int getType(int paramInt)
  {
    throw new UnsupportedOperationException();
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
 * Qualified Name:     jmd
 * JD-Core Version:    0.7.0.1
 */