import java.util.Collections;
import java.util.Map;

final class map
{
  final String a;
  final Map<String, String> b;
  final long c;
  final long d;
  
  public map(maq parammaq)
  {
    this.a = parammaq.b;
    this.b = Collections.unmodifiableMap(parammaq.a);
    this.c = parammaq.c;
    this.d = parammaq.d;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     map
 * JD-Core Version:    0.7.0.1
 */