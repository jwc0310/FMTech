import android.app.Activity;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class pad
{
  private final mek a;
  private final Activity b;
  private final Set<pac> c;
  private final ots d;
  private final Map<String, rgq<pac>> e;
  private Set<pac> f;
  
  pad(Activity paramActivity, Set<pac> paramSet, ots paramots, Map<String, rgq<pac>> paramMap)
  {
    this.c = paramSet;
    this.b = paramActivity;
    if ((paramActivity instanceof mej)) {}
    for (this.a = ((mej)paramActivity).i_();; this.a = null)
    {
      this.d = paramots;
      this.e = paramMap;
      return;
    }
  }
  
  public final void a()
  {
    if (this.a != null)
    {
      this.f = new HashSet();
      this.f.addAll(this.c);
      ots localots = this.d;
      Activity localActivity = this.b;
      Object localObject;
      Set localSet;
      if ((localActivity instanceof oyw))
      {
        localObject = ((oyw)localActivity).av_();
        if (Object.class.isAssignableFrom(localObject.getClass()))
        {
          Class localClass = localObject.getClass();
          localSet = (Set)localots.a.get(localClass.getName());
          if (localSet == null) {
            break label190;
          }
        }
      }
      for (;;)
      {
        Iterator localIterator1 = localSet.iterator();
        while (localIterator1.hasNext())
        {
          Annotation localAnnotation = (Annotation)localIterator1.next();
          rgq localrgq = (rgq)this.e.get(localAnnotation.annotationType().getName());
          if (localrgq != null) {
            this.f.add(localrgq.a());
          }
        }
        localObject = null;
        break;
        label190:
        localSet = Collections.emptySet();
      }
      Iterator localIterator2 = this.f.iterator();
      while (localIterator2.hasNext())
      {
        pac localpac = (pac)localIterator2.next();
        this.a.a(localpac);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     pad
 * JD-Core Version:    0.7.0.1
 */