package Basic_To_Advanced_DataStructure.CodingTask.Solid_Principle;

import javax.swing.text.View;

public class Interface_Segregation_Principle {

}

/**
 * Before using this principle
 */
interface MyOnClickListener {
    void onClick(View v);

    boolean onLongClick(View v);

    void onTouch(View v, MotionEvent event);
}

interface OnClickListener {
    void onClick(View v);
}

/**
 * After using this principle
 */
interface OnLongClickListener {

    boolean onLongClick(View v);
}

interface OnTouchListener {
    void onTouch(View v, MotionEvent event);
}


class MotionEvent {
}
