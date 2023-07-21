package sec01;

public class CheckBox {
	
	OnSelectListener listener;
	
	void setOnselectListener(OnSelectListener listener) {
		this.listener = listener;
	}

	void select() {
		listener.onSelect();
	}
	
	static interface OnSelectListener{
		void onSelect();
	}
}
