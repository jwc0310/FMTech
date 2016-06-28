import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Bundle;
import java.lang.reflect.Array;

public final class hra
  extends AbstractCursor
{
  public Cursor[] a;
  public int b;
  private int[][] c;
  private final int d;
  private Cursor e;
  private final int f;
  private final int[] g;
  private final int[] h;
  private final int[][] i;
  private int j = -1;
  private int k;
  private final Bundle l = new Bundle();
  private DataSetObserver m = new hrb(this);
  
  public hra(Cursor[] paramArrayOfCursor, String[] paramArrayOfString, int paramInt)
  {
    this(paramArrayOfCursor, paramArrayOfString, 0, 128);
  }
  
  private hra(Cursor[] paramArrayOfCursor, String[] paramArrayOfString, int paramInt1, int paramInt2)
  {
    this.a = paramArrayOfCursor;
    this.d = paramInt1;
    int n = this.a.length;
    int[] arrayOfInt1 = { paramArrayOfString.length, n };
    this.c = ((int[][])Array.newInstance(Integer.TYPE, arrayOfInt1));
    for (int i1 = 0; i1 < n; i1++) {
      if (this.a[i1] != null)
      {
        this.a[i1].registerDataSetObserver(this.m);
        this.a[i1].moveToFirst();
        for (int i6 = 0; i6 < paramArrayOfString.length; i6++) {
          this.c[i6][i1] = this.a[i1].getColumnIndexOrThrow(paramArrayOfString[i6]);
        }
      }
    }
    this.b = -1;
    this.e = null;
    long[] arrayOfLong1 = new long[this.c.length];
    long[] arrayOfLong2 = new long[this.c.length];
    int i2 = 0;
    int i4;
    label288:
    long l1;
    long l2;
    int i5;
    if (i2 < n) {
      if ((this.a[i2] != null) && (!this.a[i2].isAfterLast()))
      {
        for (int i3 = 0; i3 < this.c.length; i3++) {
          arrayOfLong2[i3] = this.a[i2].getLong(this.c[i3][i2]);
        }
        i4 = 0;
        if (i4 >= this.c.length) {
          break label493;
        }
        l1 = arrayOfLong2[i4];
        l2 = arrayOfLong1[i4];
        if ((l1 == l2) && (i4 < this.c.length)) {
          break label423;
        }
        if (this.d != 1) {
          break label403;
        }
        if (l1 >= l2) {
          break label397;
        }
        i5 = 1;
      }
    }
    for (;;)
    {
      if ((this.b == -1) || (i5 != 0))
      {
        System.arraycopy(arrayOfLong2, 0, arrayOfLong1, 0, arrayOfLong2.length);
        this.b = i2;
        this.e = this.a[i2];
      }
      i2++;
      break;
      label397:
      i5 = 0;
      continue;
      label403:
      if (l1 > l2)
      {
        i5 = 1;
      }
      else
      {
        i5 = 0;
        continue;
        label423:
        i4++;
        break label288;
        this.f = 128;
        this.g = new int[this.f];
        this.h = new int[this.f];
        a();
        int[] arrayOfInt2 = { this.f, n };
        this.i = ((int[][])Array.newInstance(Integer.TYPE, arrayOfInt2));
        return;
        label493:
        i5 = 0;
      }
    }
  }
  
  final void a()
  {
    for (int n = -1 + this.g.length; n >= 0; n--) {
      this.g[n] = -2147483648;
    }
    this.k = -2147483648;
  }
  
  public final void close()
  {
    int n = this.a.length;
    for (int i1 = 0; i1 < n; i1++) {
      if (this.a[i1] != null) {
        this.a[i1].close();
      }
    }
  }
  
  public final byte[] getBlob(int paramInt)
  {
    return this.e.getBlob(paramInt);
  }
  
  public final String[] getColumnNames()
  {
    if (this.b >= 0) {
      return this.e.getColumnNames();
    }
    int n = this.a.length;
    for (int i1 = 0; i1 < n; i1++) {
      if (this.a[i1] != null) {
        return this.a[i1].getColumnNames();
      }
    }
    throw new IllegalStateException("No cursor that can return names");
  }
  
  public final int getCount()
  {
    int n = 0;
    if (this.k >= 0) {
      return this.k;
    }
    int i1 = this.a.length;
    for (int i2 = 0; i2 < i1; i2++) {
      if (this.a[i2] != null) {
        n += this.a[i2].getCount();
      }
    }
    this.k = n;
    return n;
  }
  
  public final double getDouble(int paramInt)
  {
    return this.e.getDouble(paramInt);
  }
  
  public final Bundle getExtras()
  {
    return this.l;
  }
  
  public final float getFloat(int paramInt)
  {
    return this.e.getFloat(paramInt);
  }
  
  public final int getInt(int paramInt)
  {
    return this.e.getInt(paramInt);
  }
  
  public final long getLong(int paramInt)
  {
    return this.e.getLong(paramInt);
  }
  
  public final short getShort(int paramInt)
  {
    return this.e.getShort(paramInt);
  }
  
  public final String getString(int paramInt)
  {
    return this.e.getString(paramInt);
  }
  
  public final int getType(int paramInt)
  {
    return this.e.getType(paramInt);
  }
  
  public final boolean isNull(int paramInt)
  {
    return this.e.isNull(paramInt);
  }
  
  public final boolean onMove(int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {
      return true;
    }
    int n = paramInt2 % this.f;
    if (this.g[n] == paramInt2)
    {
      int i14 = this.h[n];
      this.b = i14;
      this.e = this.a[i14];
      if (this.e != null)
      {
        this.e.moveToPosition(this.i[n][i14]);
        this.j = n;
        return true;
      }
    }
    this.b = -1;
    this.e = null;
    int i1 = this.a.length;
    if ((paramInt2 < paramInt1) || (paramInt1 == -1)) {
      for (int i2 = 0; i2 < i1; i2++) {
        if (this.a[i2] != null) {
          this.a[i2].moveToFirst();
        }
      }
    }
    label196:
    label335:
    label609:
    label616:
    label622:
    for (int i3 = 0;; i3 = paramInt1)
    {
      if (i3 < 0) {
        i3 = 0;
      }
      int i4 = -1;
      int i5 = i3;
      long[] arrayOfLong1;
      long[] arrayOfLong2;
      int i6;
      int i11;
      long l1;
      long l2;
      int i12;
      if (i5 <= paramInt2)
      {
        arrayOfLong1 = new long[this.c.length];
        i4 = -1;
        arrayOfLong2 = new long[this.c.length];
        i6 = 0;
        if (i6 < i1)
        {
          if ((this.a[i6] == null) || (this.a[i6].isAfterLast())) {
            break label609;
          }
          int i10 = 0;
          while (i10 < this.c.length)
          {
            arrayOfLong2[i10] = this.a[i6].getLong(this.c[i10][i6]);
            i10++;
            continue;
            if (this.j < 0) {
              break label622;
            }
            for (int i13 = 0; i13 < i1; i13++) {
              if (this.a[i13] != null) {
                this.a[i13].moveToPosition(this.i[this.j][i13]);
              }
            }
          }
          i11 = 0;
          if (i11 >= this.c.length) {
            break label616;
          }
          l1 = arrayOfLong2[i11];
          l2 = arrayOfLong1[i11];
          if ((l1 != l2) || (i11 >= this.c.length)) {
            if (this.d == 1) {
              if (l1 < l2) {
                i12 = 1;
              }
            }
          }
        }
      }
      for (;;)
      {
        if ((i4 < 0) || (i12 != 0)) {
          System.arraycopy(arrayOfLong2, 0, arrayOfLong1, 0, arrayOfLong2.length);
        }
        for (int i9 = i6;; i9 = i4)
        {
          i6++;
          i4 = i9;
          break label196;
          i12 = 0;
          break label396;
          if (l1 > l2)
          {
            i12 = 1;
            break label396;
          }
          i12 = 0;
          break label396;
          i11++;
          break label335;
          if (paramInt2 - i5 <= this.f)
          {
            int i7 = i5 % this.f;
            this.g[i7] = i5;
            this.h[i7] = i4;
            for (int i8 = 0; i8 < i1; i8++) {
              if (this.a[i8] != null) {
                this.i[i7][i8] = this.a[i8].getPosition();
              }
            }
          }
          if (i5 != paramInt2)
          {
            if (this.a[i4] != null) {
              this.a[i4].moveToNext();
            }
            i5++;
            break;
          }
          this.b = i4;
          this.e = this.a[i4];
          this.j = -1;
          return true;
        }
        i12 = 0;
      }
    }
  }
  
  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    int n = this.a.length;
    for (int i1 = 0; i1 < n; i1++) {
      if (this.a[i1] != null) {
        this.a[i1].registerDataSetObserver(paramDataSetObserver);
      }
    }
  }
  
  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    int n = this.a.length;
    for (int i1 = 0; i1 < n; i1++) {
      if (this.a[i1] != null) {
        this.a[i1].unregisterDataSetObserver(paramDataSetObserver);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hra
 * JD-Core Version:    0.7.0.1
 */