import android.database.AbstractCursor;
import android.database.CursorIndexOutOfBoundsException;

public final class jsp
  extends AbstractCursor
{
  public Object[] a;
  public int b = 0;
  public final int c;
  private final String[] d;
  
  public jsp(String[] paramArrayOfString)
  {
    this(paramArrayOfString, 16);
  }
  
  private jsp(String[] paramArrayOfString, int paramInt)
  {
    this.d = paramArrayOfString;
    this.c = paramArrayOfString.length;
    this.a = new Object[this.c << 4];
  }
  
  private final Object a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.c))
    {
      int i = this.c;
      throw new CursorIndexOutOfBoundsException(56 + "Requested column: " + paramInt + ", # of columns: " + i);
    }
    if (this.mPos < 0) {
      throw new CursorIndexOutOfBoundsException("Before first row.");
    }
    if (this.mPos >= this.b) {
      throw new CursorIndexOutOfBoundsException("After last row.");
    }
    return this.a[(paramInt + this.mPos * this.c)];
  }
  
  public final byte[] getBlob(int paramInt)
  {
    return (byte[])a(paramInt);
  }
  
  public final String[] getColumnNames()
  {
    return this.d;
  }
  
  public final int getCount()
  {
    return this.b;
  }
  
  public final double getDouble(int paramInt)
  {
    Object localObject = a(paramInt);
    if (localObject == null) {
      return 0.0D;
    }
    if ((localObject instanceof Number)) {
      return ((Number)localObject).doubleValue();
    }
    return Double.parseDouble(localObject.toString());
  }
  
  public final float getFloat(int paramInt)
  {
    Object localObject = a(paramInt);
    if (localObject == null) {
      return 0.0F;
    }
    if ((localObject instanceof Number)) {
      return ((Number)localObject).floatValue();
    }
    return Float.parseFloat(localObject.toString());
  }
  
  public final int getInt(int paramInt)
  {
    Object localObject = a(paramInt);
    if (localObject == null) {
      return 0;
    }
    if ((localObject instanceof Number)) {
      return ((Number)localObject).intValue();
    }
    return Integer.parseInt(localObject.toString());
  }
  
  public final long getLong(int paramInt)
  {
    Object localObject = a(paramInt);
    if (localObject == null) {
      return 0L;
    }
    if ((localObject instanceof Number)) {
      return ((Number)localObject).longValue();
    }
    return Long.parseLong(localObject.toString());
  }
  
  public final short getShort(int paramInt)
  {
    Object localObject = a(paramInt);
    if (localObject == null) {
      return 0;
    }
    if ((localObject instanceof Number)) {
      return ((Number)localObject).shortValue();
    }
    return Short.parseShort(localObject.toString());
  }
  
  public final String getString(int paramInt)
  {
    Object localObject = a(paramInt);
    if (localObject == null) {
      return null;
    }
    return localObject.toString();
  }
  
  public final int getType(int paramInt)
  {
    Object localObject = a(paramInt);
    if (localObject == null) {
      return 0;
    }
    if ((localObject instanceof byte[])) {
      return 4;
    }
    if (((localObject instanceof Float)) || ((localObject instanceof Double))) {
      return 2;
    }
    if (((localObject instanceof Long)) || ((localObject instanceof Integer))) {
      return 1;
    }
    return 3;
  }
  
  public final boolean isNull(int paramInt)
  {
    return a(paramInt) == null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jsp
 * JD-Core Version:    0.7.0.1
 */