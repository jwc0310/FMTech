import android.text.TextUtils;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class ecg
{
  private long a = 0L;
  private int b = 0;
  private String c = null;
  private String d;
  private String e = null;
  private String f = null;
  private int g = -1;
  private JSONObject h = null;
  
  ecg(JSONObject paramJSONObject)
  {
    this.a = paramJSONObject.getLong("trackId");
    String str1 = paramJSONObject.getString("type");
    String str2;
    if ("TEXT".equals(str1))
    {
      this.b = 1;
      this.c = paramJSONObject.optString("trackContentId", null);
      this.d = paramJSONObject.optString("trackContentType", null);
      this.e = paramJSONObject.optString("name", null);
      this.f = paramJSONObject.optString("language", null);
      if (!paramJSONObject.has("subtype")) {
        break label305;
      }
      str2 = paramJSONObject.getString("subtype");
      if (!"SUBTITLES".equals(str2)) {
        break label213;
      }
      this.g = 1;
    }
    label305:
    for (;;)
    {
      this.h = paramJSONObject.optJSONObject("customData");
      return;
      if ("AUDIO".equals(str1))
      {
        this.b = 2;
        break;
      }
      if ("VIDEO".equals(str1))
      {
        this.b = 3;
        break;
      }
      throw new JSONException("invalid type: " + str1);
      label213:
      if ("CAPTIONS".equals(str2))
      {
        this.g = 2;
      }
      else if ("DESCRIPTIONS".equals(str2))
      {
        this.g = 3;
      }
      else if ("CHAPTERS".equals(str2))
      {
        this.g = 4;
      }
      else if ("METADATA".equals(str2))
      {
        this.g = 5;
      }
      else
      {
        throw new JSONException("invalid subtype: " + str2);
        this.g = 0;
      }
    }
  }
  
  public final JSONObject a()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("trackId", this.a);
      switch (this.b)
      {
      default: 
        if (this.c != null) {
          localJSONObject.put("trackContentId", this.c);
        }
        if (this.d != null) {
          localJSONObject.put("trackContentType", this.d);
        }
        if (this.e != null) {
          localJSONObject.put("name", this.e);
        }
        if (!TextUtils.isEmpty(this.f)) {
          localJSONObject.put("language", this.f);
        }
        switch (this.g)
        {
        }
        break;
      }
      for (;;)
      {
        if (this.h == null) {
          break label276;
        }
        localJSONObject.put("customData", this.h);
        return localJSONObject;
        localJSONObject.put("type", "TEXT");
        break;
        localJSONObject.put("type", "AUDIO");
        break;
        localJSONObject.put("type", "VIDEO");
        break;
        localJSONObject.put("subtype", "SUBTITLES");
        continue;
        localJSONObject.put("subtype", "CAPTIONS");
        continue;
        localJSONObject.put("subtype", "DESCRIPTIONS");
        continue;
        localJSONObject.put("subtype", "CHAPTERS");
        continue;
        localJSONObject.put("subtype", "METADATA");
      }
      label276:
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return localJSONObject;
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
      bool1 = paramObject instanceof ecg;
      bool2 = false;
    } while (!bool1);
    ecg localecg = (ecg)paramObject;
    int i;
    if (this.h == null)
    {
      i = 1;
      label36:
      if (localecg.h != null) {
        break label247;
      }
    }
    label247:
    for (int j = 1;; j = 0)
    {
      bool2 = false;
      if (i != j) {
        break;
      }
      if ((this.h != null) && (localecg.h != null))
      {
        boolean bool8 = ejt.a(this.h, localecg.h);
        bool2 = false;
        if (!bool8) {
          break;
        }
      }
      boolean bool3 = this.a < localecg.a;
      bool2 = false;
      if (bool3) {
        break;
      }
      int k = this.b;
      int m = localecg.b;
      bool2 = false;
      if (k != m) {
        break;
      }
      boolean bool4 = edd.a(this.c, localecg.c);
      bool2 = false;
      if (!bool4) {
        break;
      }
      boolean bool5 = edd.a(this.d, localecg.d);
      bool2 = false;
      if (!bool5) {
        break;
      }
      boolean bool6 = edd.a(this.e, localecg.e);
      bool2 = false;
      if (!bool6) {
        break;
      }
      boolean bool7 = edd.a(this.f, localecg.f);
      bool2 = false;
      if (!bool7) {
        break;
      }
      int n = this.g;
      int i1 = localecg.g;
      bool2 = false;
      if (n != i1) {
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
    arrayOfObject[0] = Long.valueOf(this.a);
    arrayOfObject[1] = Integer.valueOf(this.b);
    arrayOfObject[2] = this.c;
    arrayOfObject[3] = this.d;
    arrayOfObject[4] = this.e;
    arrayOfObject[5] = this.f;
    arrayOfObject[6] = Integer.valueOf(this.g);
    arrayOfObject[7] = this.h;
    return Arrays.hashCode(arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ecg
 * JD-Core Version:    0.7.0.1
 */