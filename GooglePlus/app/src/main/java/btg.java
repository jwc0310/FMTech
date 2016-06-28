import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class btg
{
  final int a;
  final long b;
  final boolean c;
  List<bth> d = new ArrayList();
  Map<String, Integer> e = new HashMap();
  int f;
  long g;
  boolean h;
  
  public btg(int paramInt, long paramLong, boolean paramBoolean)
  {
    this.a = paramInt;
    this.b = paramLong;
    this.c = paramBoolean;
    if (paramLong <= 0L) {
      this.h = true;
    }
  }
  
  static String a(String paramString, int paramInt)
  {
    return 11 + String.valueOf(paramString).length() + paramString + paramInt;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     btg
 * JD-Core Version:    0.7.0.1
 */