import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class eby
{
  public final String a;
  public int b;
  public String c;
  public long d;
  private eca e;
  private List<ecg> f;
  private ecs g;
  private JSONObject h;
  
  eby(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("content ID cannot be null or empty");
    }
    this.a = paramString;
    this.b = -1;
    this.d = -1L;
  }
  
  eby(JSONObject paramJSONObject)
  {
    this.a = paramJSONObject.getString("contentId");
    String str1 = paramJSONObject.getString("streamType");
    if ("NONE".equals(str1)) {
      this.b = 0;
    }
    for (;;)
    {
      this.c = paramJSONObject.getString("contentType");
      JSONObject localJSONObject2;
      eca localeca;
      if (paramJSONObject.has("metadata"))
      {
        localJSONObject2 = paramJSONObject.getJSONObject("metadata");
        this.e = new eca(localJSONObject2.getInt("metadataType"));
        localeca = this.e;
        localeca.b.clear();
        localeca.a.clear();
        localeca.c = 0;
      }
      try
      {
        localeca.c = localJSONObject2.getInt("metadataType");
        label122:
        eyv.a(localeca.a, localJSONObject2);
        switch (localeca.c)
        {
        default: 
          localeca.a(localJSONObject2, new String[0]);
        }
        for (;;)
        {
          this.d = -1L;
          if ((paramJSONObject.has("duration")) && (!paramJSONObject.isNull("duration")))
          {
            double d1 = paramJSONObject.optDouble("duration", 0.0D);
            if ((!Double.isNaN(d1)) && (!Double.isInfinite(d1))) {
              this.d = edd.a(d1);
            }
          }
          if (!paramJSONObject.has("tracks")) {
            break label580;
          }
          this.f = new ArrayList();
          JSONArray localJSONArray = paramJSONObject.getJSONArray("tracks");
          for (int i = 0; i < localJSONArray.length(); i++)
          {
            ecg localecg = new ecg(localJSONArray.getJSONObject(i));
            this.f.add(localecg);
          }
          if ("BUFFERED".equals(str1))
          {
            this.b = 1;
            break;
          }
          if ("LIVE".equals(str1))
          {
            this.b = 2;
            break;
          }
          this.b = -1;
          break;
          localeca.a(localJSONObject2, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
          continue;
          localeca.a(localJSONObject2, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
          continue;
          localeca.a(localJSONObject2, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE" });
          continue;
          localeca.a(localJSONObject2, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
          continue;
          localeca.a(localJSONObject2, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE" });
        }
        label580:
        this.f = null;
        ecs localecs;
        String str5;
        String str4;
        label736:
        String str3;
        label820:
        String str2;
        if (paramJSONObject.has("textTrackStyle"))
        {
          JSONObject localJSONObject1 = paramJSONObject.getJSONObject("textTrackStyle");
          localecs = new ecs();
          localecs.a();
          localecs.a = ((float)localJSONObject1.optDouble("fontScale", 1.0D));
          localecs.b = ecs.a(localJSONObject1.optString("foregroundColor"));
          localecs.c = ecs.a(localJSONObject1.optString("backgroundColor"));
          if (localJSONObject1.has("edgeType"))
          {
            str5 = localJSONObject1.getString("edgeType");
            if ("NONE".equals(str5)) {
              localecs.d = 0;
            }
          }
          else
          {
            localecs.e = ecs.a(localJSONObject1.optString("edgeColor"));
            if (localJSONObject1.has("windowType"))
            {
              str4 = localJSONObject1.getString("windowType");
              if (!"NONE".equals(str4)) {
                break label966;
              }
              localecs.f = 0;
            }
            localecs.g = ecs.a(localJSONObject1.optString("windowColor"));
            if (localecs.f == 2) {
              localecs.h = localJSONObject1.optInt("windowRoundedCornerRadius", 0);
            }
            localecs.i = localJSONObject1.optString("fontFamily", null);
            if (localJSONObject1.has("fontGenericFamily"))
            {
              str3 = localJSONObject1.getString("fontGenericFamily");
              if (!"SANS_SERIF".equals(str3)) {
                break label1006;
              }
              localecs.j = 0;
            }
            if (localJSONObject1.has("fontStyle"))
            {
              str2 = localJSONObject1.getString("fontStyle");
              if (!"NORMAL".equals(str2)) {
                break label1127;
              }
              localecs.k = 0;
            }
            label856:
            localecs.l = localJSONObject1.optJSONObject("customData");
          }
        }
        for (this.g = localecs;; this.g = null)
        {
          this.h = paramJSONObject.optJSONObject("customData");
          return;
          if ("OUTLINE".equals(str5))
          {
            localecs.d = 1;
            break;
          }
          if ("DROP_SHADOW".equals(str5))
          {
            localecs.d = 2;
            break;
          }
          if ("RAISED".equals(str5))
          {
            localecs.d = 3;
            break;
          }
          if (!"DEPRESSED".equals(str5)) {
            break;
          }
          localecs.d = 4;
          break;
          label966:
          if ("NORMAL".equals(str4))
          {
            localecs.f = 1;
            break label736;
          }
          if (!"ROUNDED_CORNERS".equals(str4)) {
            break label736;
          }
          localecs.f = 2;
          break label736;
          label1006:
          if ("MONOSPACED_SANS_SERIF".equals(str3))
          {
            localecs.j = 1;
            break label820;
          }
          if ("SERIF".equals(str3))
          {
            localecs.j = 2;
            break label820;
          }
          if ("MONOSPACED_SERIF".equals(str3))
          {
            localecs.j = 3;
            break label820;
          }
          if ("CASUAL".equals(str3))
          {
            localecs.j = 4;
            break label820;
          }
          if ("CURSIVE".equals(str3))
          {
            localecs.j = 5;
            break label820;
          }
          if (!"SMALL_CAPITALS".equals(str3)) {
            break label820;
          }
          localecs.j = 6;
          break label820;
          label1127:
          if ("BOLD".equals(str2))
          {
            localecs.k = 1;
            break label856;
          }
          if ("ITALIC".equals(str2))
          {
            localecs.k = 2;
            break label856;
          }
          if (!"BOLD_ITALIC".equals(str2)) {
            break label856;
          }
          localecs.k = 3;
          break label856;
        }
      }
      catch (JSONException localJSONException)
      {
        break label122;
      }
    }
  }
  
  public final JSONObject a()
  {
    JSONObject localJSONObject = new JSONObject();
    for (;;)
    {
      try
      {
        localJSONObject.put("contentId", this.a);
        switch (this.b)
        {
        default: 
          localJSONObject.put("streamType", localObject);
          if (this.c != null) {
            localJSONObject.put("contentType", this.c);
          }
          if (this.e != null) {
            localJSONObject.put("metadata", this.e.a());
          }
          JSONArray localJSONArray;
          if (this.d <= -1L)
          {
            localJSONObject.put("duration", JSONObject.NULL);
            if (this.f == null) {
              continue;
            }
            localJSONArray = new JSONArray();
            Iterator localIterator = this.f.iterator();
            if (localIterator.hasNext())
            {
              localJSONArray.put(((ecg)localIterator.next()).a());
              continue;
            }
          }
          else
          {
            localJSONObject.put("duration", edd.a(this.d));
            continue;
          }
          localJSONObject.put("tracks", localJSONArray);
          if (this.g != null) {
            localJSONObject.put("textTrackStyle", this.g.b());
          }
          if (this.h == null) {
            break label248;
          }
          localJSONObject.put("customData", this.h);
          return localJSONObject;
        }
      }
      catch (JSONException localJSONException) {}
      Object localObject = "NONE";
      continue;
      label248:
      return localJSONObject;
      localObject = "BUFFERED";
      continue;
      localObject = "LIVE";
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
      bool1 = paramObject instanceof eby;
      bool2 = false;
    } while (!bool1);
    eby localeby = (eby)paramObject;
    int i;
    if (this.h == null)
    {
      i = 1;
      label36:
      if (localeby.h != null) {
        break label204;
      }
    }
    label204:
    for (int j = 1;; j = 0)
    {
      bool2 = false;
      if (i != j) {
        break;
      }
      if ((this.h != null) && (localeby.h != null))
      {
        boolean bool7 = ejt.a(this.h, localeby.h);
        bool2 = false;
        if (!bool7) {
          break;
        }
      }
      boolean bool3 = edd.a(this.a, localeby.a);
      bool2 = false;
      if (!bool3) {
        break;
      }
      int k = this.b;
      int m = localeby.b;
      bool2 = false;
      if (k != m) {
        break;
      }
      boolean bool4 = edd.a(this.c, localeby.c);
      bool2 = false;
      if (!bool4) {
        break;
      }
      boolean bool5 = edd.a(this.e, localeby.e);
      bool2 = false;
      if (!bool5) {
        break;
      }
      boolean bool6 = this.d < localeby.d;
      bool2 = false;
      if (bool6) {
        break;
      }
      return true;
      i = 0;
      break label36;
    }
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this.a;
    arrayOfObject[1] = Integer.valueOf(this.b);
    arrayOfObject[2] = this.c;
    arrayOfObject[3] = this.e;
    arrayOfObject[4] = Long.valueOf(this.d);
    arrayOfObject[5] = String.valueOf(this.h);
    return Arrays.hashCode(arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eby
 * JD-Core Version:    0.7.0.1
 */