import java.util.ArrayList;

public class Dispatcher {
    private ArrayList interceptors;

    public Dispatcher(){
        interceptors = new ArrayList();
    }

    // add interceptors
    public void registerInterceptor(Interceptor i){
        interceptors.add(i);
    }

    // remove interceptor
    public void removeInterceptor(Interceptor i){
        int index = interceptors.indexOf(i);
        if (index >= 0){
            interceptors.remove(i);
        }
    }

    // notify interceptor
    public void notifyInterceptors(ContextObject context){
        for (int i = 0; i < interceptors.size(); i++) {
            Interceptor interceptor = (Interceptor)interceptors.get(i);
            interceptor.update(context);
        }
    }
}
