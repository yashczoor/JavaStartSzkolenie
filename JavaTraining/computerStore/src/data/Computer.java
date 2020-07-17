package data;

public class Computer {
	//field
	private String producer;
	private int model;
	//getset
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	//construct
	public Computer(String producer, int model) {
		setProducer(producer);
		setModel(model);
	}
	
	@Override
	public String toString() {
		return getProducer() + " " + getModel();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(!(obj instanceof Computer))
			return false;
		Computer c = (Computer) obj;
		
		if (this.producer.equals(c.getProducer()) && this.model == c.model)
			return true;
		if (this.producer != null) {
			if(!this.producer.equals(c.producer)) 
				return false;
			} else if (this.producer == null && c.producer !=null)
				return false;
		return true;
	}
}
