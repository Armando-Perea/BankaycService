package com.java.bankayc.app.model;

public class VersionGroupDetails {

	Integer level_learned_at;
	
	MoveLearnMethod move_learn_method;
	
	VersionGroup version_group;

	public Integer getLevel_learned_at() {
		return level_learned_at;
	}

	public void setLevel_learned_at(Integer level_learned_at) {
		this.level_learned_at = level_learned_at;
	}

	public MoveLearnMethod getMove_learn_method() {
		return move_learn_method;
	}

	public void setMove_learn_method(MoveLearnMethod move_learn_method) {
		this.move_learn_method = move_learn_method;
	}

	public VersionGroup getVersion_group() {
		return version_group;
	}

	public void setVersion_group(VersionGroup version_group) {
		this.version_group = version_group;
	}

	@Override
	public String toString() {
		return "VersionGroupDetails [level_learned_at=" + level_learned_at + ", move_learn_method=" + move_learn_method
				+ ", version_group=" + version_group + "]";
	}
	
}
