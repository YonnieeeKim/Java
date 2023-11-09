package ex_231106.exam_multi_type_parameter;


public class Product<T, M> {
	private T kind; // 상품의 종류
	private M model;// 상품의 모델명

	public Product() {
	}

	public Product(T kind, M model) {
		this.kind = kind;
		this.model = model;
	}

	public T getKind() {
		return kind;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}

	public String toString() {
		return "kind : " + kind.getClass().getSimpleName().toUpperCase() + ", model : " + model;
	}

}