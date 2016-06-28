import android.os.Bundle;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class eca
{
  private static final ecb d = new ecb().a("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4).a("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4).a("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4).a("com.google.android.gms.cast.metadata.TITLE", "title", 1).a("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1).a("com.google.android.gms.cast.metadata.ARTIST", "artist", 1).a("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1).a("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1).a("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1).a("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2).a("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2).a("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2).a("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2).a("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1).a("com.google.android.gms.cast.metadata.STUDIO", "studio", 1).a("com.google.android.gms.cast.metadata.WIDTH", "width", 2).a("com.google.android.gms.cast.metadata.HEIGHT", "height", 2).a("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1).a("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3).a("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
  final List<WebImage> a = new ArrayList();
  final Bundle b = new Bundle();
  int c;
  
  static
  {
    new String[] { null, "String", "int", "double", "ISO-8601 date String" };
  }
  
  public eca()
  {
    this(0);
  }
  
  public eca(int paramInt)
  {
    this.c = paramInt;
  }
  
  private final boolean a(Bundle paramBundle1, Bundle paramBundle2)
  {
    if (paramBundle1.size() != paramBundle2.size()) {
      return false;
    }
    Iterator localIterator = paramBundle1.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject1 = paramBundle1.get(str);
      Object localObject2 = paramBundle2.get(str);
      if (((localObject1 instanceof Bundle)) && ((localObject2 instanceof Bundle)) && (!a((Bundle)localObject1, (Bundle)localObject2))) {
        return false;
      }
      if (localObject1 == null)
      {
        if ((localObject2 != null) || (!paramBundle2.containsKey(str))) {
          return false;
        }
      }
      else if (!localObject1.equals(localObject2)) {
        return false;
      }
    }
    return true;
  }
  
  private final void b(JSONObject paramJSONObject, String... paramVarArgs)
  {
    try
    {
      int i = paramVarArgs.length;
      for (int j = 0;; j++)
      {
        String str1;
        if (j < i)
        {
          str1 = paramVarArgs[j];
          if (!this.b.containsKey(str1)) {}
        }
        else
        {
          switch (d.a(str1))
          {
          case 1: 
          case 4: 
            paramJSONObject.put((String)d.a.get(str1), this.b.getString(str1));
            break;
          case 2: 
            paramJSONObject.put((String)d.a.get(str1), this.b.getInt(str1));
            break;
          case 3: 
            paramJSONObject.put((String)d.a.get(str1), this.b.getDouble(str1));
            continue;
            Iterator localIterator = this.b.keySet().iterator();
            while (localIterator.hasNext())
            {
              String str2 = (String)localIterator.next();
              if (!str2.startsWith("com.google."))
              {
                Object localObject = this.b.get(str2);
                if ((localObject instanceof String)) {
                  paramJSONObject.put(str2, localObject);
                } else if ((localObject instanceof Integer)) {
                  paramJSONObject.put(str2, localObject);
                } else if ((localObject instanceof Double)) {
                  paramJSONObject.put(str2, localObject);
                }
              }
            }
          }
        }
      }
      return;
    }
    catch (JSONException localJSONException) {}
  }
  
  public final JSONObject a()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("metadataType", this.c);
      label19:
      eyv.a(localJSONObject, this.a);
      switch (this.c)
      {
      default: 
        b(localJSONObject, new String[0]);
        return localJSONObject;
      case 0: 
        b(localJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
        return localJSONObject;
      case 1: 
        b(localJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
        return localJSONObject;
      case 2: 
        b(localJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE" });
        return localJSONObject;
      case 3: 
        b(localJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE" });
        return localJSONObject;
      }
      b(localJSONObject, new String[] { "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE" });
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      break label19;
    }
  }
  
  final void a(JSONObject paramJSONObject, String... paramVarArgs)
  {
    HashSet localHashSet = new HashSet(Arrays.asList(paramVarArgs));
    try
    {
      Iterator localIterator = paramJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str1 = (String)localIterator.next();
        if (!"metadataType".equals(str1))
        {
          String str2 = (String)d.b.get(str1);
          if (str2 != null)
          {
            boolean bool = localHashSet.contains(str2);
            if (!bool) {}
          }
          else
          {
            try
            {
              Object localObject1 = paramJSONObject.get(str1);
              if (localObject1 != null) {
                switch (d.a(str2))
                {
                case 1: 
                  if ((localObject1 instanceof String)) {
                    this.b.putString(str2, (String)localObject1);
                  }
                  break;
                case 4: 
                  if (((localObject1 instanceof String)) && (eyv.a((String)localObject1) != null)) {
                    this.b.putString(str2, (String)localObject1);
                  }
                  break;
                case 2: 
                  if ((localObject1 instanceof Integer)) {
                    this.b.putInt(str2, ((Integer)localObject1).intValue());
                  }
                  break;
                case 3: 
                  if ((localObject1 instanceof Double))
                  {
                    this.b.putDouble(str2, ((Double)localObject1).doubleValue());
                    continue;
                    Object localObject2 = paramJSONObject.get(str1);
                    if ((localObject2 instanceof String)) {
                      this.b.putString(str1, (String)localObject2);
                    } else if ((localObject2 instanceof Integer)) {
                      this.b.putInt(str1, ((Integer)localObject2).intValue());
                    } else if ((localObject2 instanceof Double)) {
                      this.b.putDouble(str1, ((Double)localObject2).doubleValue());
                    }
                  }
                  break;
                }
              }
            }
            catch (JSONException localJSONException2) {}
          }
        }
      }
      return;
    }
    catch (JSONException localJSONException1) {}
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    eca localeca;
    do
    {
      return true;
      if (!(paramObject instanceof eca)) {
        return false;
      }
      localeca = (eca)paramObject;
    } while ((a(this.b, localeca.b)) && (this.a.equals(localeca.a)));
    return false;
  }
  
  public final int hashCode()
  {
    Iterator localIterator = this.b.keySet().iterator();
    String str;
    for (int i = 17; localIterator.hasNext(); i = i * 31 + this.b.get(str).hashCode()) {
      str = (String)localIterator.next();
    }
    return i * 31 + this.a.hashCode();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eca
 * JD-Core Version:    0.7.0.1
 */