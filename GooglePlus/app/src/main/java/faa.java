import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.ReportingState;

final class faa
  implements fdq
{
  private final Status a;
  private final ReportingState b;
  
  public faa(Status paramStatus, ReportingState paramReportingState)
  {
    this.a = paramStatus;
    if (paramStatus.g == 0) {
      efj.a(paramReportingState);
    }
    this.b = paramReportingState;
  }
  
  private final void e()
  {
    if (this.a.g != 0) {
      throw new IllegalStateException("Illegal to call this method when status is failure: " + this.a);
    }
  }
  
  public final int a()
  {
    e();
    return aaw.a(this.b.b);
  }
  
  public final Status as_()
  {
    return this.a;
  }
  
  public final int c()
  {
    e();
    return aaw.a(this.b.c);
  }
  
  public final boolean d()
  {
    e();
    return this.b.d;
  }
  
  public final String toString()
  {
    return "ReportingStateResultImpl{mStatus=" + this.a + ", mReportingState=" + this.b + '}';
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     faa
 * JD-Core Version:    0.7.0.1
 */