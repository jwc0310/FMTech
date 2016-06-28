import java.util.Iterator;

final class jrz
{
  private final String a;
  
  jrz(String paramString)
  {
    this.a = paramString;
  }
  
  private static CharSequence a(Object paramObject)
  {
    if ((paramObject instanceof CharSequence)) {
      return (CharSequence)paramObject;
    }
    return paramObject.toString();
  }
  
  public final StringBuilder a(StringBuilder paramStringBuilder, Iterable<?> paramIterable)
  {
    Iterator localIterator = paramIterable.iterator();
    if (localIterator.hasNext())
    {
      paramStringBuilder.append(a(localIterator.next()));
      while (localIterator.hasNext())
      {
        paramStringBuilder.append(this.a);
        paramStringBuilder.append(a(localIterator.next()));
      }
    }
    return paramStringBuilder;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jrz
 * JD-Core Version:    0.7.0.1
 */