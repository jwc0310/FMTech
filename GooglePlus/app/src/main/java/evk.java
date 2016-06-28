import android.app.ApplicationErrorReport;
import android.app.ApplicationErrorReport.CrashInfo;
import com.google.android.gms.feedback.FeedbackOptions;

public final class evk
  extends evj
{
  public final ApplicationErrorReport h = new ApplicationErrorReport();
  
  public evk()
  {
    this.h.crashInfo = new ApplicationErrorReport.CrashInfo();
    this.h.crashInfo.throwLineNumber = -1;
  }
  
  public final FeedbackOptions a()
  {
    efj.a(this.h.crashInfo.exceptionClassName);
    efj.a(this.h.crashInfo.throwFileName);
    efj.a(this.h.crashInfo.throwClassName);
    efj.a(this.h.crashInfo.throwMethodName);
    efj.a(this.h.crashInfo.stackTrace);
    return FeedbackOptions.d(FeedbackOptions.a(super.a(), this.h.crashInfo), null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     evk
 * JD-Core Version:    0.7.0.1
 */