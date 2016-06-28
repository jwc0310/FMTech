import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ecc
{
  eby a;
  int b = 0;
  double c;
  double d = (1.0D / 0.0D);
  double e;
  private boolean f = true;
  private long[] g;
  private JSONObject h;
  
  ecc(eby parameby)
  {
    if (parameby == null) {
      throw new IllegalArgumentException("media cannot be null.");
    }
    this.a = parameby;
  }
  
  ecc(JSONObject paramJSONObject)
  {
    a(paramJSONObject);
  }
  
  public final boolean a(JSONObject paramJSONObject)
  {
    if (paramJSONObject.has("media")) {
      this.a = new eby(paramJSONObject.getJSONObject("media"));
    }
    for (boolean bool1 = true;; bool1 = false)
    {
      if (paramJSONObject.has("itemId"))
      {
        int n = paramJSONObject.getInt("itemId");
        if (this.b != n)
        {
          this.b = n;
          bool1 = true;
        }
      }
      if (paramJSONObject.has("autoplay"))
      {
        boolean bool2 = paramJSONObject.getBoolean("autoplay");
        if (this.f != bool2)
        {
          this.f = bool2;
          bool1 = true;
        }
      }
      if (paramJSONObject.has("startTime"))
      {
        double d3 = paramJSONObject.getDouble("startTime");
        if (Math.abs(d3 - this.c) > 1.0E-007D)
        {
          this.c = d3;
          bool1 = true;
        }
      }
      if (paramJSONObject.has("playbackDuration"))
      {
        double d2 = paramJSONObject.getDouble("playbackDuration");
        if (Math.abs(d2 - this.d) > 1.0E-007D)
        {
          this.d = d2;
          bool1 = true;
        }
      }
      if (paramJSONObject.has("preloadTime"))
      {
        double d1 = paramJSONObject.getDouble("preloadTime");
        if (Math.abs(d1 - this.e) > 1.0E-007D)
        {
          this.e = d1;
          bool1 = true;
        }
      }
      int j;
      long[] arrayOfLong2;
      long[] arrayOfLong1;
      int i;
      if (paramJSONObject.has("activeTrackIds"))
      {
        JSONArray localJSONArray = paramJSONObject.getJSONArray("activeTrackIds");
        j = localJSONArray.length();
        arrayOfLong2 = new long[j];
        for (int k = 0; k < j; k++) {
          arrayOfLong2[k] = localJSONArray.getLong(k);
        }
        if (this.g == null)
        {
          arrayOfLong1 = arrayOfLong2;
          i = 1;
        }
      }
      for (;;)
      {
        if (i != 0)
        {
          this.g = arrayOfLong1;
          bool1 = true;
        }
        if (paramJSONObject.has("customData"))
        {
          this.h = paramJSONObject.getJSONObject("customData");
          return true;
          if (this.g.length != j)
          {
            arrayOfLong1 = arrayOfLong2;
            i = 1;
          }
          else
          {
            for (int m = 0;; m++)
            {
              if (m >= j) {
                break label388;
              }
              if (this.g[m] != arrayOfLong2[m])
              {
                arrayOfLong1 = arrayOfLong2;
                i = 1;
                break;
              }
            }
          }
        }
        else
        {
          return bool1;
          label388:
          arrayOfLong1 = arrayOfLong2;
          i = 0;
          continue;
          arrayOfLong1 = null;
          i = 0;
        }
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (this == paramObject) {
      bool2 = true;
    }
    boolean bool1;
    do
    {
      return bool2;
      bool1 = paramObject instanceof ecc;
      bool2 = false;
    } while (!bool1);
    ecc localecc = (ecc)paramObject;
    int i;
    if (this.h == null)
    {
      i = 1;
      label36:
      if (localecc.h != null) {
        break label243;
      }
    }
    label243:
    for (int j = 1;; j = 0)
    {
      bool2 = false;
      if (i != j) {
        break;
      }
      if ((this.h != null) && (localecc.h != null))
      {
        boolean bool10 = ejt.a(this.h, localecc.h);
        bool2 = false;
        if (!bool10) {
          break;
        }
      }
      boolean bool3 = edd.a(this.a, localecc.a);
      bool2 = false;
      if (!bool3) {
        break;
      }
      int k = this.b;
      int m = localecc.b;
      bool2 = false;
      if (k != m) {
        break;
      }
      boolean bool4 = this.f;
      boolean bool5 = localecc.f;
      bool2 = false;
      if (bool4 != bool5) {
        break;
      }
      boolean bool6 = this.c < localecc.c;
      bool2 = false;
      if (bool6) {
        break;
      }
      boolean bool7 = this.d < localecc.d;
      bool2 = false;
      if (bool7) {
        break;
      }
      boolean bool8 = this.e < localecc.e;
      bool2 = false;
      if (bool8) {
        break;
      }
      boolean bool9 = edd.a(this.g, localecc.g);
      bool2 = false;
      if (!bool9) {
        break;
      }
      return true;
      i = 0;
      break label36;
    }
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = Integer.valueOf(this.b);
    arrayOfObject[2] = Boolean.valueOf(this.f);
    arrayOfObject[3] = Double.valueOf(this.c);
    arrayOfObject[4] = Double.valueOf(this.d);
    arrayOfObject[5] = Double.valueOf(this.e);
    arrayOfObject[6] = this.g;
    arrayOfObject[7] = String.valueOf(this.h);
    return Arrays.hashCode(arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ecc
 * JD-Core Version:    0.7.0.1
 */