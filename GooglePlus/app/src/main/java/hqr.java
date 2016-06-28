import android.database.AbstractCursor;
import android.database.CursorIndexOutOfBoundsException;
import android.os.Bundle;

public final class hqr
  extends AbstractCursor
{
  private final String[] a;
  private Object[] b;
  private int c = 0;
  private final int d;
  private final Bundle e = new Bundle();
  
  public hqr(String[] paramArrayOfString)
  {
    this(paramArrayOfString, 16);
  }
  
  public hqr(String[] paramArrayOfString, int paramInt)
  {
    this.a = paramArrayOfString;
    this.d = paramArrayOfString.length;
    if (paramInt <= 0) {
      paramInt = 1;
    }
    this.b = new Object[paramInt * this.d];
  }
  
  private final Object a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.d))
    {
      int i = this.d;
      throw new CursorIndexOutOfBoundsException(56 + "Requested column: " + paramInt + ", # of columns: " + i);
    }
    if (this.mPos < 0) {
      throw new CursorIndexOutOfBoundsException("Before first row.");
    }
    if (this.mPos >= this.c) {
      throw new CursorIndexOutOfBoundsException("After last row.");
    }
    return this.b[(paramInt + this.mPos * this.d)];
  }
  
  public final void a(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject.length != this.d)
    {
      int n = this.d;
      int i1 = paramArrayOfObject.length;
      throw new IllegalArgumentException(67 + "columnNames.length = " + n + ", columnValues.length = " + i1);
    }
    int i = this.c;
    this.c = (i + 1);
    int j = i * this.d;
    int k = j + this.d;
    Object[] arrayOfObject;
    int m;
    if (k > this.b.length)
    {
      arrayOfObject = this.b;
      m = this.b.length << 1;
      if (m >= k) {
        break label156;
      }
    }
    for (;;)
    {
      this.b = new Object[k];
      System.arraycopy(arrayOfObject, 0, this.b, 0, arrayOfObject.length);
      System.arraycopy(paramArrayOfObject, 0, this.b, j, this.d);
      return;
      label156:
      k = m;
    }
  }
  
  public final byte[] getBlob(int paramInt)
  {
    return (byte[])a(paramInt);
  }
  
  public final String[] getColumnNames()
  {
    return this.a;
  }
  
  public final int getCount()
  {
    return this.c;
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
  
  public final Bundle getExtras()
  {
    return this.e;
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
 * Qualified Name:     hqr
 * JD-Core Version:    0.7.0.1
 */