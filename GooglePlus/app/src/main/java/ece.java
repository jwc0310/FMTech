import android.util.SparseArray;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ece
{
  int a = 0;
  public long b;
  public eby c;
  public double d;
  public int e;
  public int f;
  public long g;
  private long h;
  private double i;
  private boolean j;
  private long[] k;
  private int l = 0;
  private int m = 0;
  private final ecf n = new ecf(this);
  
  public ece(JSONObject paramJSONObject)
  {
    a(paramJSONObject, 0);
  }
  
  public final int a(JSONObject paramJSONObject, int paramInt)
  {
    long l1 = paramJSONObject.getLong("mediaSessionId");
    boolean bool1 = l1 < this.b;
    int i1 = 0;
    if (bool1)
    {
      this.b = l1;
      i1 = 1;
    }
    String str2;
    int i23;
    if (paramJSONObject.has("playerState"))
    {
      str2 = paramJSONObject.getString("playerState");
      if (!str2.equals("IDLE")) {
        break label407;
      }
      i23 = 1;
      if (i23 == this.e) {
        break label1629;
      }
      this.e = i23;
    }
    label407:
    label538:
    label840:
    label1489:
    label1622:
    label1629:
    for (int i24 = i1 | 0x2;; i24 = i1)
    {
      String str3;
      int i25;
      if ((i23 == 1) && (paramJSONObject.has("idleReason")))
      {
        str3 = paramJSONObject.getString("idleReason");
        if (str3.equals("CANCELLED"))
        {
          i25 = 2;
          label118:
          if (i25 == this.f) {
            break label1622;
          }
          this.f = i25;
        }
      }
      for (i1 = i24 | 0x2;; i1 = i24)
      {
        if (paramJSONObject.has("playbackRate"))
        {
          double d2 = paramJSONObject.getDouble("playbackRate");
          if (this.d != d2)
          {
            this.d = d2;
            i1 |= 0x2;
          }
        }
        if ((paramJSONObject.has("currentTime")) && ((paramInt & 0x2) == 0))
        {
          long l3 = edd.a(paramJSONObject.getDouble("currentTime"));
          if (l3 != this.g)
          {
            this.g = l3;
            i1 |= 0x2;
          }
        }
        if (paramJSONObject.has("supportedMediaCommands"))
        {
          long l2 = paramJSONObject.getLong("supportedMediaCommands");
          if (l2 != this.h)
          {
            this.h = l2;
            i1 |= 0x2;
          }
        }
        if ((paramJSONObject.has("volume")) && ((paramInt & 0x1) == 0))
        {
          JSONObject localJSONObject3 = paramJSONObject.getJSONObject("volume");
          double d1 = localJSONObject3.getDouble("level");
          if (d1 != this.i)
          {
            this.i = d1;
            i1 |= 0x2;
          }
          boolean bool3 = localJSONObject3.getBoolean("muted");
          if (bool3 != this.j)
          {
            this.j = bool3;
            i1 |= 0x2;
          }
        }
        int i20;
        long[] arrayOfLong2;
        int i2;
        if (paramJSONObject.has("activeTrackIds"))
        {
          JSONArray localJSONArray2 = paramJSONObject.getJSONArray("activeTrackIds");
          i20 = localJSONArray2.length();
          arrayOfLong2 = new long[i20];
          int i21 = 0;
          for (;;)
          {
            if (i21 < i20)
            {
              arrayOfLong2[i21] = localJSONArray2.getLong(i21);
              i21++;
              continue;
              if (str2.equals("PLAYING"))
              {
                i23 = 2;
                break;
              }
              if (str2.equals("PAUSED"))
              {
                i23 = 3;
                break;
              }
              boolean bool4 = str2.equals("BUFFERING");
              i23 = 0;
              if (!bool4) {
                break;
              }
              i23 = 4;
              break;
              if (str3.equals("INTERRUPTED"))
              {
                i25 = 3;
                break label118;
              }
              if (str3.equals("FINISHED"))
              {
                i25 = 1;
                break label118;
              }
              boolean bool5 = str3.equals("ERROR");
              i25 = 0;
              if (!bool5) {
                break label118;
              }
              i25 = 4;
              break label118;
            }
          }
          if (this.k == null)
          {
            i2 = 1;
            if (i2 != 0) {
              this.k = arrayOfLong2;
            }
            if (i2 != 0)
            {
              this.k = arrayOfLong2;
              i1 |= 0x2;
            }
            if (paramJSONObject.has("customData"))
            {
              paramJSONObject.getJSONObject("customData");
              i1 |= 0x2;
            }
            if (paramJSONObject.has("media"))
            {
              JSONObject localJSONObject2 = paramJSONObject.getJSONObject("media");
              this.c = new eby(localJSONObject2);
              i1 |= 0x2;
              if (localJSONObject2.has("metadata")) {
                i1 |= 0x4;
              }
            }
            if (paramJSONObject.has("currentItemId"))
            {
              int i19 = paramJSONObject.getInt("currentItemId");
              if (this.a != i19)
              {
                this.a = i19;
                i1 |= 0x2;
              }
            }
            int i3 = paramJSONObject.optInt("preloadedItemId", 0);
            if (this.m != i3)
            {
              this.m = i3;
              i1 |= 0x10;
            }
            int i4 = paramJSONObject.optInt("loadingItemId", 0);
            if (this.l == i4) {
              break label1615;
            }
            this.l = i4;
          }
        }
        for (int i5 = i1 | 0x2;; i5 = i1)
        {
          int i6 = this.e;
          int i7 = this.l;
          int i8;
          label754:
          ecf localecf2;
          int i17;
          String str1;
          int i18;
          if ((i6 == 1) && (i7 == 0))
          {
            i8 = 1;
            if (i8 != 0) {
              break label1536;
            }
            localecf2 = this.n;
            if (!paramJSONObject.has("repeatMode")) {
              break label1609;
            }
            i17 = localecf2.a;
            str1 = paramJSONObject.getString("repeatMode");
            i18 = -1;
            switch (str1.hashCode())
            {
            default: 
              switch (i18)
              {
              default: 
                label872:
                if (localecf2.a != i17) {
                  localecf2.a = i17;
                }
                break;
              }
              break;
            }
          }
          for (int i9 = 1;; i9 = 0)
          {
            ecc[] arrayOfecc;
            int i13;
            if (paramJSONObject.has("items"))
            {
              JSONArray localJSONArray1 = paramJSONObject.getJSONArray("items");
              int i10 = localJSONArray1.length();
              SparseArray localSparseArray = new SparseArray();
              int i11 = 0;
              for (;;)
              {
                if (i11 < i10)
                {
                  localSparseArray.put(i11, Integer.valueOf(localJSONArray1.getJSONObject(i11).getInt("itemId")));
                  i11++;
                  continue;
                  if (this.k.length != i20)
                  {
                    i2 = 1;
                    break;
                  }
                  for (int i22 = 0;; i22++)
                  {
                    i2 = 0;
                    if (i22 >= i20) {
                      break;
                    }
                    if (this.k[i22] != arrayOfLong2[i22])
                    {
                      i2 = 1;
                      break;
                    }
                  }
                  long[] arrayOfLong1 = this.k;
                  arrayOfLong2 = null;
                  i2 = 0;
                  if (arrayOfLong1 == null) {
                    break label538;
                  }
                  i2 = 1;
                  arrayOfLong2 = null;
                  break label538;
                  i8 = 0;
                  break label754;
                  if (!str1.equals("REPEAT_OFF")) {
                    break label840;
                  }
                  i18 = 0;
                  break label840;
                  if (!str1.equals("REPEAT_ALL")) {
                    break label840;
                  }
                  i18 = 1;
                  break label840;
                  if (!str1.equals("REPEAT_SINGLE")) {
                    break label840;
                  }
                  i18 = 2;
                  break label840;
                  if (!str1.equals("REPEAT_ALL_AND_SHUFFLE")) {
                    break label840;
                  }
                  i18 = 3;
                  break label840;
                  i17 = 0;
                  break label872;
                  i17 = 1;
                  break label872;
                  i17 = 2;
                  break label872;
                  i17 = 3;
                  break label872;
                }
              }
              arrayOfecc = new ecc[i10];
              int i12 = 0;
              i13 = i9;
              if (i12 < i10)
              {
                Integer localInteger1 = (Integer)localSparseArray.get(i12);
                JSONObject localJSONObject1 = localJSONArray1.getJSONObject(i12);
                int i14 = localInteger1.intValue();
                Integer localInteger2 = (Integer)localecf2.c.get(i14);
                ecc localecc1;
                boolean bool2;
                int i15;
                if (localInteger2 == null)
                {
                  localecc1 = null;
                  if (localecc1 == null) {
                    break label1300;
                  }
                  bool2 = i13 | localecc1.a(localJSONObject1);
                  arrayOfecc[i12] = localecc1;
                  int i16 = localInteger1.intValue();
                  if (i12 == ((Integer)localecf2.c.get(i16)).intValue()) {
                    break label1489;
                  }
                  i15 = 1;
                }
                for (;;)
                {
                  i12++;
                  i13 = i15;
                  break;
                  localecc1 = (ecc)localecf2.b.get(localInteger2.intValue());
                  break label1212;
                  bool2 = true;
                  if (localInteger1.intValue() == localecf2.d.a)
                  {
                    ecd localecd = new ecd(localecf2.d.c);
                    ecc localecc2 = localecd.a;
                    if (localecc2.a == null) {
                      throw new IllegalArgumentException("media cannot be null.");
                    }
                    if ((Double.isNaN(localecc2.c)) || (localecc2.c < 0.0D)) {
                      throw new IllegalArgumentException("startTime cannot be negative or NaN.");
                    }
                    if (Double.isNaN(localecc2.d)) {
                      throw new IllegalArgumentException("playbackDuration cannot be NaN.");
                    }
                    if ((Double.isNaN(localecc2.e)) || (localecc2.e < 0.0D)) {
                      throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
                    }
                    arrayOfecc[i12] = localecd.a;
                    arrayOfecc[i12].a(localJSONObject1);
                    i15 = bool2;
                  }
                  else
                  {
                    arrayOfecc[i12] = new ecc(localJSONObject1);
                    i15 = bool2;
                  }
                }
              }
              if (localecf2.b.size() == i10) {
                break label1602;
              }
            }
            for (i9 = 1;; i9 = i13)
            {
              localecf2.a(arrayOfecc);
              if (i9 != 0) {
                i5 |= 0x8;
              }
              do
              {
                return i5;
                this.a = 0;
                this.l = 0;
                this.m = 0;
              } while (this.n.b.size() <= 0);
              ecf localecf1 = this.n;
              localecf1.a = 0;
              localecf1.b.clear();
              localecf1.c.clear();
              return i5 | 0x8;
            }
          }
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ece
 * JD-Core Version:    0.7.0.1
 */