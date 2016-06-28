import android.graphics.Color;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class ecs
{
  float a;
  int b;
  int c;
  int d;
  int e;
  int f;
  int g;
  int h;
  String i;
  int j;
  int k;
  JSONObject l;
  
  public ecs()
  {
    a();
  }
  
  static int a(String paramString)
  {
    int m = 0;
    if (paramString != null)
    {
      int n = paramString.length();
      m = 0;
      if (n == 9)
      {
        int i1 = paramString.charAt(0);
        m = 0;
        if (i1 != 35) {}
      }
    }
    try
    {
      int i2 = Integer.parseInt(paramString.substring(1, 3), 16);
      int i3 = Integer.parseInt(paramString.substring(3, 5), 16);
      int i4 = Integer.parseInt(paramString.substring(5, 7), 16);
      int i5 = Color.argb(Integer.parseInt(paramString.substring(7, 9), 16), i2, i3, i4);
      m = i5;
      return m;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return 0;
  }
  
  private static String a(int paramInt)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(Color.red(paramInt));
    arrayOfObject[1] = Integer.valueOf(Color.green(paramInt));
    arrayOfObject[2] = Integer.valueOf(Color.blue(paramInt));
    arrayOfObject[3] = Integer.valueOf(Color.alpha(paramInt));
    return String.format("#%02X%02X%02X%02X", arrayOfObject);
  }
  
  final void a()
  {
    this.a = 1.0F;
    this.b = 0;
    this.c = 0;
    this.d = -1;
    this.e = 0;
    this.f = -1;
    this.g = 0;
    this.h = 0;
    this.i = null;
    this.j = -1;
    this.k = -1;
    this.l = null;
  }
  
  public final JSONObject b()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("fontScale", this.a);
      if (this.b != 0) {
        localJSONObject.put("foregroundColor", a(this.b));
      }
      if (this.c != 0) {
        localJSONObject.put("backgroundColor", a(this.c));
      }
      switch (this.d)
      {
      default: 
        if (this.e != 0) {
          localJSONObject.put("edgeColor", a(this.e));
        }
        switch (this.f)
        {
        default: 
          label152:
          if (this.g != 0) {
            localJSONObject.put("windowColor", a(this.g));
          }
          if (this.f == 2) {
            localJSONObject.put("windowRoundedCornerRadius", this.h);
          }
          if (this.i != null) {
            localJSONObject.put("fontFamily", this.i);
          }
          switch (this.j)
          {
          default: 
            label256:
            switch (this.k)
            {
            }
            break;
          }
          break;
        }
        break;
      }
      for (;;)
      {
        if (this.l == null) {
          break label540;
        }
        localJSONObject.put("customData", this.l);
        return localJSONObject;
        localJSONObject.put("edgeType", "NONE");
        break;
        localJSONObject.put("edgeType", "OUTLINE");
        break;
        localJSONObject.put("edgeType", "DROP_SHADOW");
        break;
        localJSONObject.put("edgeType", "RAISED");
        break;
        localJSONObject.put("edgeType", "DEPRESSED");
        break;
        localJSONObject.put("windowType", "NONE");
        break label152;
        localJSONObject.put("windowType", "NORMAL");
        break label152;
        localJSONObject.put("windowType", "ROUNDED_CORNERS");
        break label152;
        localJSONObject.put("fontGenericFamily", "SANS_SERIF");
        break label256;
        localJSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
        break label256;
        localJSONObject.put("fontGenericFamily", "SERIF");
        break label256;
        localJSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
        break label256;
        localJSONObject.put("fontGenericFamily", "CASUAL");
        break label256;
        localJSONObject.put("fontGenericFamily", "CURSIVE");
        break label256;
        localJSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
        break label256;
        localJSONObject.put("fontStyle", "NORMAL");
        continue;
        localJSONObject.put("fontStyle", "BOLD");
        continue;
        localJSONObject.put("fontStyle", "ITALIC");
        continue;
        localJSONObject.put("fontStyle", "BOLD_ITALIC");
      }
      label540:
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
      bool1 = paramObject instanceof ecs;
      bool2 = false;
    } while (!bool1);
    ecs localecs = (ecs)paramObject;
    int m;
    if (this.l == null)
    {
      m = 1;
      label36:
      if (localecs.l != null) {
        break label316;
      }
    }
    label316:
    for (int n = 1;; n = 0)
    {
      bool2 = false;
      if (m != n) {
        break;
      }
      if ((this.l != null) && (localecs.l != null))
      {
        boolean bool5 = ejt.a(this.l, localecs.l);
        bool2 = false;
        if (!bool5) {
          break;
        }
      }
      boolean bool3 = this.a < localecs.a;
      bool2 = false;
      if (bool3) {
        break;
      }
      int i1 = this.b;
      int i2 = localecs.b;
      bool2 = false;
      if (i1 != i2) {
        break;
      }
      int i3 = this.c;
      int i4 = localecs.c;
      bool2 = false;
      if (i3 != i4) {
        break;
      }
      int i5 = this.d;
      int i6 = localecs.d;
      bool2 = false;
      if (i5 != i6) {
        break;
      }
      int i7 = this.e;
      int i8 = localecs.e;
      bool2 = false;
      if (i7 != i8) {
        break;
      }
      int i9 = this.f;
      int i10 = localecs.f;
      bool2 = false;
      if (i9 != i10) {
        break;
      }
      int i11 = this.h;
      int i12 = localecs.h;
      bool2 = false;
      if (i11 != i12) {
        break;
      }
      boolean bool4 = edd.a(this.i, localecs.i);
      bool2 = false;
      if (!bool4) {
        break;
      }
      int i13 = this.j;
      int i14 = localecs.j;
      bool2 = false;
      if (i13 != i14) {
        break;
      }
      int i15 = this.k;
      int i16 = localecs.k;
      bool2 = false;
      if (i15 != i16) {
        break;
      }
      return true;
      m = 0;
      break label36;
    }
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[12];
    arrayOfObject[0] = Float.valueOf(this.a);
    arrayOfObject[1] = Integer.valueOf(this.b);
    arrayOfObject[2] = Integer.valueOf(this.c);
    arrayOfObject[3] = Integer.valueOf(this.d);
    arrayOfObject[4] = Integer.valueOf(this.e);
    arrayOfObject[5] = Integer.valueOf(this.f);
    arrayOfObject[6] = Integer.valueOf(this.g);
    arrayOfObject[7] = Integer.valueOf(this.h);
    arrayOfObject[8] = this.i;
    arrayOfObject[9] = Integer.valueOf(this.j);
    arrayOfObject[10] = Integer.valueOf(this.k);
    arrayOfObject[11] = this.l;
    return Arrays.hashCode(arrayOfObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ecs
 * JD-Core Version:    0.7.0.1
 */