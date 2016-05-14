package guilhermeborgesbastos.com.br.tindercardslide.util;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView;


/**
 * Created by Guilherme Borges Bastos on 02/17/2016.
 * guilhermeborgesbastos@gmail.com
 */

abstract class BaseLaunchAdapterView extends AdapterView {

    private int heightMeasureSpec;
    private int widthMeasureSpec;


    public BaseLaunchAdapterView(Context context) {
        super(context);
    }

    public BaseLaunchAdapterView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseLaunchAdapterView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void setSelection(int i) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.widthMeasureSpec = widthMeasureSpec;
        this.heightMeasureSpec = heightMeasureSpec;
    }


    public int getWidthMeasureSpec() {
        return widthMeasureSpec;
    }

    public int getHeightMeasureSpec() {
        return heightMeasureSpec;
    }


}
