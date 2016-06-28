import android.database.Cursor;
import android.database.CursorWrapper;
import android.text.TextUtils;

final class hmq
  extends CursorWrapper
{
  private final int a;
  
  public hmq(Cursor paramCursor, int paramInt)
  {
    super(paramCursor);
    this.a = paramInt;
  }
  
  public final byte[] getBlob(int paramInt)
  {
    if (paramInt == this.a) {
      return null;
    }
    return getWrappedCursor().getBlob(paramInt);
  }
  
  public final int getColumnCount()
  {
    return 1 + getWrappedCursor().getColumnCount();
  }
  
  public final int getColumnIndex(String paramString)
  {
    if (TextUtils.equals(paramString, "profileItemType")) {
      return this.a;
    }
    return getWrappedCursor().getColumnIndex(paramString);
  }
  
  public final String getColumnName(int paramInt)
  {
    if (paramInt == this.a) {
      return "profileItemType";
    }
    return getWrappedCursor().getColumnName(paramInt);
  }
  
  public final String[] getColumnNames()
  {
    return hmp.r;
  }
  
  public final double getDouble(int paramInt)
  {
    if (paramInt == this.a) {
      return 2.0D;
    }
    return getWrappedCursor().getDouble(paramInt);
  }
  
  public final float getFloat(int paramInt)
  {
    if (paramInt == this.a) {
      return 2.0F;
    }
    return getWrappedCursor().getFloat(paramInt);
  }
  
  public final int getInt(int paramInt)
  {
    if (paramInt == this.a) {
      return 2;
    }
    return getWrappedCursor().getInt(paramInt);
  }
  
  public final long getLong(int paramInt)
  {
    if (paramInt == this.a) {
      return 2L;
    }
    return getWrappedCursor().getLong(paramInt);
  }
  
  public final short getShort(int paramInt)
  {
    if (paramInt == this.a) {
      return 2;
    }
    return getWrappedCursor().getShort(paramInt);
  }
  
  public final String getString(int paramInt)
  {
    if (paramInt == this.a) {
      return "2";
    }
    return getWrappedCursor().getString(paramInt);
  }
  
  public final int getType(int paramInt)
  {
    if (paramInt == this.a) {
      return 1;
    }
    return getWrappedCursor().getType(paramInt);
  }
  
  public final boolean isNull(int paramInt)
  {
    return (paramInt != this.a) && (getWrappedCursor().isNull(paramInt));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hmq
 * JD-Core Version:    0.7.0.1
 */