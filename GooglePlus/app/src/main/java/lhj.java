import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class lhj
  implements Parcelable
{
  public static final Parcelable.Creator<lhj> CREATOR = new lhk();
  String a;
  String b;
  public hqr c;
  private int d;
  private int e;
  
  public lhj(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    String[] arrayOfString = paramParcel.createStringArray();
    int i = paramParcel.readInt();
    int j = arrayOfString.length;
    this.c = new hqr(arrayOfString);
    Object[] arrayOfObject = new Object[j];
    for (int k = 0; k < i; k++)
    {
      int m = 0;
      if (m < j)
      {
        switch (paramParcel.readInt())
        {
        default: 
          arrayOfObject[m] = null;
        }
        for (;;)
        {
          m++;
          break;
          arrayOfObject[m] = Long.valueOf(paramParcel.readLong());
          continue;
          arrayOfObject[m] = Double.valueOf(paramParcel.readDouble());
          continue;
          arrayOfObject[m] = paramParcel.readString();
          continue;
          arrayOfObject[m] = paramParcel.createByteArray();
        }
      }
      this.c.a(arrayOfObject);
    }
  }
  
  public lhj(String[] paramArrayOfString)
  {
    this(paramArrayOfString, 500);
  }
  
  private lhj(String[] paramArrayOfString, int paramInt)
  {
    this.c = new hqr(paramArrayOfString);
    this.d = 500;
    this.e = -1;
    for (int i = 0;; i++) {
      if (i < paramArrayOfString.length)
      {
        if ("_id".equals(paramArrayOfString[i])) {
          this.e = i;
        }
      }
      else {
        return;
      }
    }
  }
  
  public final void a(hqr paramhqr)
  {
    if (paramhqr != null)
    {
      int i = paramhqr.getColumnCount();
      paramhqr.moveToPosition(-1);
      Object[] arrayOfObject = new Object[i];
      int j = this.c.getCount();
      while (paramhqr.moveToNext())
      {
        int k = 0;
        if (k < i)
        {
          switch (paramhqr.getType(k))
          {
          default: 
            arrayOfObject[k] = null;
          }
          for (;;)
          {
            k++;
            break;
            arrayOfObject[k] = Long.valueOf(paramhqr.getLong(k));
            continue;
            arrayOfObject[k] = Double.valueOf(paramhqr.getDouble(k));
            continue;
            arrayOfObject[k] = paramhqr.getString(k);
            continue;
            arrayOfObject[k] = paramhqr.getBlob(k);
          }
        }
        if (this.e > 0)
        {
          int m = this.e;
          int n = j + 1;
          arrayOfObject[m] = Integer.valueOf(j);
          j = n;
        }
        this.c.a(arrayOfObject);
      }
    }
  }
  
  public final void a(String paramString)
  {
    if (TextUtils.equals(this.a, paramString)) {
      return;
    }
    this.a = paramString;
    this.c = new hqr(this.c.getColumnNames());
    this.b = null;
  }
  
  public final boolean a()
  {
    return this.c.getCount() <= this.d;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeStringArray(this.c.getColumnNames());
    int i = this.c.getCount();
    int j = this.c.getColumnNames().length;
    paramParcel.writeInt(i);
    for (int k = 0; k < i; k++)
    {
      this.c.moveToPosition(k);
      int m = 0;
      if (m < j)
      {
        int n = this.c.getType(m);
        paramParcel.writeInt(n);
        switch (n)
        {
        }
        for (;;)
        {
          m++;
          break;
          paramParcel.writeLong(this.c.getLong(m));
          continue;
          paramParcel.writeDouble(this.c.getDouble(m));
          continue;
          paramParcel.writeString(this.c.getString(m));
          continue;
          paramParcel.writeByteArray(this.c.getBlob(m));
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lhj
 * JD-Core Version:    0.7.0.1
 */