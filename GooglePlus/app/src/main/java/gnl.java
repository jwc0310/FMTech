import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class gnl
  extends jht
{
  public static gnb a(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getShort();
    ArrayList localArrayList1 = new ArrayList(i);
    int j = 0;
    if (j < i)
    {
      String str9 = jht.d(paramByteBuffer);
      String str10 = jht.d(paramByteBuffer);
      String str11 = jht.d(paramByteBuffer);
      String str12 = jht.d(paramByteBuffer);
      if (paramByteBuffer.getInt() != 0) {}
      for (boolean bool3 = true;; bool3 = false)
      {
        localArrayList1.add(new jjd(str9, str10, str11, str12, bool3));
        j++;
        break;
      }
    }
    int k = paramByteBuffer.getShort();
    ArrayList localArrayList2 = new ArrayList(k);
    for (int m = 0; m < k; m++)
    {
      String str7 = jht.d(paramByteBuffer);
      String str8 = jht.d(paramByteBuffer);
      localArrayList2.add(new jgs(str7, paramByteBuffer.getInt(), str8, paramByteBuffer.getInt()));
    }
    int n = paramByteBuffer.getShort();
    ArrayList localArrayList3 = new ArrayList(n);
    int i1 = 0;
    if (i1 < n)
    {
      String str3 = mab.d(paramByteBuffer);
      String str4 = mab.d(paramByteBuffer);
      String str5 = mab.d(paramByteBuffer);
      String str6 = mab.d(paramByteBuffer);
      if (paramByteBuffer.getInt() != 0) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        localArrayList3.add(new lhp(str3, str4, str5, str6, bool2));
        i1++;
        break;
      }
    }
    int i2 = paramByteBuffer.getShort();
    ArrayList localArrayList4 = new ArrayList(i2);
    int i3 = 0;
    if (i3 < i2)
    {
      String str1 = mab.d(paramByteBuffer);
      String str2 = mab.d(paramByteBuffer);
      if (paramByteBuffer.getInt() != 0) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        localArrayList4.add(new hps(str1, str2, bool1));
        i3++;
        break;
      }
    }
    return new gnb(localArrayList1, localArrayList2, localArrayList3, localArrayList4, paramByteBuffer.getInt());
  }
  
  public static gnb a(byte[] paramArrayOfByte)
  {
    return a(ByteBuffer.wrap(paramArrayOfByte));
  }
  
  public static byte[] a(gnb paramgnb)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    for (;;)
    {
      try
      {
        localDataOutputStream.writeShort(paramgnb.b.length);
        jjd[] arrayOfjjd = paramgnb.b;
        int i = arrayOfjjd.length;
        int j = 0;
        if (j < i)
        {
          jjd localjjd = arrayOfjjd[j];
          jht.a(localDataOutputStream, localjjd.a);
          jht.a(localDataOutputStream, localjjd.b);
          jht.a(localDataOutputStream, localjjd.c);
          jht.a(localDataOutputStream, localjjd.d);
          if (localjjd.e)
          {
            k = 1;
            localDataOutputStream.writeInt(k);
            j++;
          }
        }
        else
        {
          localDataOutputStream.writeShort(paramgnb.c.length);
          jgs[] arrayOfjgs = paramgnb.c;
          int m = arrayOfjgs.length;
          int n = 0;
          if (n < m)
          {
            jgs localjgs = arrayOfjgs[n];
            jht.a(localDataOutputStream, localjgs.a);
            jht.a(localDataOutputStream, localjgs.b);
            localDataOutputStream.writeInt(localjgs.c);
            localDataOutputStream.writeInt(localjgs.d);
            n++;
            continue;
          }
          localDataOutputStream.writeShort(paramgnb.d.length);
          lhp[] arrayOflhp = paramgnb.d;
          int i1 = arrayOflhp.length;
          int i2 = 0;
          if (i2 < i1)
          {
            lhp locallhp = arrayOflhp[i2];
            mab.a(localDataOutputStream, locallhp.a);
            mab.a(localDataOutputStream, locallhp.b);
            mab.a(localDataOutputStream, locallhp.c);
            mab.a(localDataOutputStream, locallhp.d);
            if (!locallhp.e) {
              break label402;
            }
            i3 = 1;
            localDataOutputStream.writeInt(i3);
            i2++;
            continue;
          }
          localDataOutputStream.writeShort(paramgnb.e.length);
          hps[] arrayOfhps = paramgnb.e;
          int i4 = arrayOfhps.length;
          int i5 = 0;
          if (i5 < i4)
          {
            hps localhps = arrayOfhps[i5];
            mab.a(localDataOutputStream, localhps.a);
            mab.a(localDataOutputStream, localhps.b);
            if (!localhps.c) {
              break label408;
            }
            i6 = 1;
            localDataOutputStream.writeInt(i6);
            i5++;
            continue;
          }
          localDataOutputStream.writeInt(paramgnb.b.length + paramgnb.a());
          return localByteArrayOutputStream.toByteArray();
        }
      }
      finally
      {
        localDataOutputStream.close();
      }
      int k = 0;
      continue;
      label402:
      int i3 = 0;
      continue;
      label408:
      int i6 = 0;
    }
  }
  
  public static byte[] a(List<gnb> paramList)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream localDataOutputStream = new DataOutputStream(localByteArrayOutputStream);
    try
    {
      int i = paramList.size();
      localDataOutputStream.writeInt(i);
      for (int j = 0; j < i; j++) {
        localDataOutputStream.write(a((gnb)paramList.get(j)));
      }
      return localByteArrayOutputStream.toByteArray();
    }
    finally
    {
      localDataOutputStream.close();
    }
  }
  
  public static ArrayList<gnb> b(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.getInt();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      localArrayList.add(a(localByteBuffer));
    }
    return localArrayList;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gnl
 * JD-Core Version:    0.7.0.1
 */