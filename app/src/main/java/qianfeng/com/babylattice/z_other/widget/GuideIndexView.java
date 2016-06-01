package qianfeng.com.babylattice.z_other.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import qianfeng.com.babylattice.R;


/**
 * Created by Administrator on 2016/5/18 0018.
 * <p/>
 * ViewPager索引，自定义小圆点
 */
public class GuideIndexView extends View {

    //当前索引的下标
    private int currentIndex;

    //小圆点的半径
    private int radius;

    //小圆点的数量
    private int count;

    //小圆点默认的颜色
    private int beforeColor;

    //小圆点被选中的颜色
    private int afterColor;

    //绘制的起点
    private int fromX;
    private int fromY;

    //两个小圆点圆心的间隔
    private int padding;

    private Paint beforePaint = new Paint();
    private Paint afterPaint = new Paint();

    public GuideIndexView(Context context) {
        super(context);
    }

    public GuideIndexView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.index_style);
        radius = (int) typedArray.getDimension(R.styleable.index_style_radius, 3);
        padding = (int) typedArray.getDimension(R.styleable.index_style_circle_padding, 12);
        beforeColor = typedArray.getColor(R.styleable.index_style_color_default, Color.GRAY);
        afterColor = typedArray.getColor(R.styleable.index_style_color_selected, Color.WHITE);

        beforePaint.setColor(beforeColor);
        beforePaint.setDither(true);
        beforePaint.setAntiAlias(true);
        beforePaint.setStyle(Paint.Style.FILL);

        afterPaint.setColor(afterColor);
        afterPaint.setDither(true);
        afterPaint.setAntiAlias(true);
        afterPaint.setStyle(Paint.Style.FILL);

        typedArray.recycle();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = getWidth();
        int height = getHeight();

        int contentWidth = radius * 2 + padding * (count - 1);

        if (contentWidth > width) {
            throw new IllegalArgumentException("宽度不够！！！");
        }

        fromX = (width - contentWidth) / 2 + radius;
        fromY = height / 2;

        for (int i = 0; i < count; i++) {
            if (i == currentIndex) {
                canvas.drawCircle(fromX + padding * i, fromY, radius, afterPaint);
            } else {
                canvas.drawCircle(fromX + padding * i, fromY, radius, beforePaint);
            }
        }
    }

    public void changeIndex(int index) {
        currentIndex = index;
        invalidate();
    }

    public void drawCount(int count) {
        this.count = count;
    }
}
