package acid;

public enum AminoAcidType { 
	  ALIPHATIC, HYDROXYL, CYCLIC, AROMATIC, BASIC, ACIDIC  ;
	  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"AminoAcidType\",\"namespace\":\"com.zenfractal\",\"symbols\":[\"ALIPHATIC\",\"HYDROXYL\",\"CYCLIC\",\"AROMATIC\",\"BASIC\",\"ACIDIC\"]}");
	  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}