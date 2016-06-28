import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;

final class bf
  implements Parcelable
{
  public static final Parcelable.Creator<bf> CREATOR = new bg();
  private int[] a;
  private int b;
  private int c;
  private String d;
  private int e;
  private int f;
  private CharSequence g;
  private int h;
  private CharSequence i;
  private ArrayList<String> j;
  private ArrayList<String> k;
  
  public bf(Parcel paramParcel)
  {
    this.a = paramParcel.createIntArray();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readString();
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    this.g = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.h = paramParcel.readInt();
    this.i = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.j = paramParcel.createStringArrayList();
    this.k = paramParcel.createStringArrayList();
  }
  
  public bf(bb parambb)
  {
    be localbe1 = parambb.a;
    int m = 0;
    while (localbe1 != null)
    {
      if (localbe1.i != null) {
        m += localbe1.i.size();
      }
      localbe1 = localbe1.a;
    }
    this.a = new int[m + 7 * parambb.b];
    if (!parambb.e) {
      throw new IllegalStateException("Not on back stack");
    }
    be localbe2 = parambb.a;
    int n = 0;
    if (localbe2 != null)
    {
      int[] arrayOfInt1 = this.a;
      int i1 = n + 1;
      arrayOfInt1[n] = localbe2.c;
      int[] arrayOfInt2 = this.a;
      int i2 = i1 + 1;
      if (localbe2.d != null) {}
      int i7;
      int i9;
      for (int i3 = localbe2.d.k;; i3 = -1)
      {
        arrayOfInt2[i1] = i3;
        int[] arrayOfInt3 = this.a;
        int i4 = i2 + 1;
        arrayOfInt3[i2] = localbe2.e;
        int[] arrayOfInt4 = this.a;
        int i5 = i4 + 1;
        arrayOfInt4[i4] = localbe2.f;
        int[] arrayOfInt5 = this.a;
        int i6 = i5 + 1;
        arrayOfInt5[i5] = localbe2.g;
        int[] arrayOfInt6 = this.a;
        i7 = i6 + 1;
        arrayOfInt6[i6] = localbe2.h;
        if (localbe2.i == null) {
          break label343;
        }
        int i8 = localbe2.i.size();
        int[] arrayOfInt8 = this.a;
        i9 = i7 + 1;
        arrayOfInt8[i7] = i8;
        int i10 = 0;
        while (i10 < i8)
        {
          int[] arrayOfInt9 = this.a;
          int i11 = i9 + 1;
          arrayOfInt9[i9] = ((bk)localbe2.i.get(i10)).k;
          i10++;
          i9 = i11;
        }
      }
      n = i9;
      for (;;)
      {
        localbe2 = localbe2.a;
        break;
        label343:
        int[] arrayOfInt7 = this.a;
        n = i7 + 1;
        arrayOfInt7[i7] = 0;
      }
    }
    this.b = parambb.c;
    this.c = parambb.d;
    this.d = parambb.f;
    this.e = parambb.g;
    this.f = parambb.h;
    this.g = parambb.i;
    this.h = parambb.j;
    this.i = parambb.k;
    this.j = parambb.l;
    this.k = parambb.m;
  }
  
  public final bb a(bz parambz)
  {
    bb localbb = new bb(parambz);
    int m = 0;
    while (m < this.a.length)
    {
      be localbe = new be();
      int[] arrayOfInt1 = this.a;
      int n = m + 1;
      localbe.c = arrayOfInt1[m];
      int[] arrayOfInt2 = this.a;
      int i1 = n + 1;
      int i2 = arrayOfInt2[n];
      if (i2 >= 0) {}
      for (localbe.d = ((bk)parambz.b.get(i2));; localbe.d = null)
      {
        int[] arrayOfInt3 = this.a;
        int i3 = i1 + 1;
        localbe.e = arrayOfInt3[i1];
        int[] arrayOfInt4 = this.a;
        int i4 = i3 + 1;
        localbe.f = arrayOfInt4[i3];
        int[] arrayOfInt5 = this.a;
        int i5 = i4 + 1;
        localbe.g = arrayOfInt5[i4];
        int[] arrayOfInt6 = this.a;
        int i6 = i5 + 1;
        localbe.h = arrayOfInt6[i5];
        int[] arrayOfInt7 = this.a;
        m = i6 + 1;
        int i7 = arrayOfInt7[i6];
        if (i7 <= 0) {
          break;
        }
        localbe.i = new ArrayList(i7);
        int i8 = 0;
        while (i8 < i7)
        {
          ArrayList localArrayList = parambz.b;
          int[] arrayOfInt8 = this.a;
          int i9 = m + 1;
          bk localbk = (bk)localArrayList.get(arrayOfInt8[m]);
          localbe.i.add(localbk);
          i8++;
          m = i9;
        }
      }
      localbb.a(localbe);
    }
    localbb.c = this.b;
    localbb.d = this.c;
    localbb.f = this.d;
    localbb.g = this.e;
    localbb.e = true;
    localbb.h = this.f;
    localbb.i = this.g;
    localbb.j = this.h;
    localbb.k = this.i;
    localbb.l = this.j;
    localbb.m = this.k;
    localbb.b(1);
    return localbb;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeIntArray(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    TextUtils.writeToParcel(this.g, paramParcel, 0);
    paramParcel.writeInt(this.h);
    TextUtils.writeToParcel(this.i, paramParcel, 0);
    paramParcel.writeStringList(this.j);
    paramParcel.writeStringList(this.k);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bf
 * JD-Core Version:    0.7.0.1
 */