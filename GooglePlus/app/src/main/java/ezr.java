import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;
import com.google.android.gms.herrevad.PredictionApi.ActiveNetworkQualityResult;

class ezr<T>
  implements efn, PredictionApi.ActiveNetworkQualityResult
{
  public final T a;
  private final Status b;
  
  public ezr(Status paramStatus, PredictedNetworkQuality paramPredictedNetworkQuality)
  {
    this(paramStatus, paramPredictedNetworkQuality);
  }
  
  public ezr(Status paramStatus, T paramT)
  {
    this.b = paramStatus;
    this.a = paramT;
  }
  
  public PredictedNetworkQuality a()
  {
    return (PredictedNetworkQuality)this.a;
  }
  
  public final Status as_()
  {
    return this.b;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ezr
 * JD-Core Version:    0.7.0.1
 */