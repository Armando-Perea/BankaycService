package com.java.bankayc.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Versions {
	
	@JsonProperty("generation-i") 
	GenerationI generation_i;
	
	@JsonProperty("generation-ii") 
	GenerationII generation_ii;
	
	@JsonProperty("generation-iii") 
	GenerationIII generation_iii;
	
	@JsonProperty("generation-iv") 
	GenerationIV generation_iv;
	
	@JsonProperty("generation-v") 
	GenerationV generation_v;
	
	@JsonProperty("generation-vi") 
	GenerationVI generation_vi;
	
	@JsonProperty("generation-vii") 
	GenerationVII generation_vii;
	
	@JsonProperty("generation-viii") 
	GenerationVIII generation_viii;

	public GenerationI getGeneration_i() {
		return generation_i;
	}

	public void setGeneration_i(GenerationI generation_i) {
		this.generation_i = generation_i;
	}

	public GenerationII getGeneration_ii() {
		return generation_ii;
	}

	public void setGeneration_ii(GenerationII generation_ii) {
		this.generation_ii = generation_ii;
	}

	public GenerationIII getGeneration_iii() {
		return generation_iii;
	}

	public void setGeneration_iii(GenerationIII generation_iii) {
		this.generation_iii = generation_iii;
	}

	public GenerationIV getGeneration_iv() {
		return generation_iv;
	}

	public void setGeneration_iv(GenerationIV generation_iv) {
		this.generation_iv = generation_iv;
	}

	public GenerationV getGeneration_v() {
		return generation_v;
	}

	public void setGeneration_v(GenerationV generation_v) {
		this.generation_v = generation_v;
	}

	public GenerationVI getGeneration_vi() {
		return generation_vi;
	}

	public void setGeneration_vi(GenerationVI generation_vi) {
		this.generation_vi = generation_vi;
	}

	public GenerationVII getGeneration_vii() {
		return generation_vii;
	}

	public void setGeneration_vii(GenerationVII generation_vii) {
		this.generation_vii = generation_vii;
	}

	public GenerationVIII getGeneration_viii() {
		return generation_viii;
	}

	public void setGeneration_viii(GenerationVIII generation_viii) {
		this.generation_viii = generation_viii;
	}

	@Override
	public String toString() {
		return "Versions [generation_i=" + generation_i + ", generation_ii=" + generation_ii + ", generation_iii="
				+ generation_iii + ", generation_iv=" + generation_iv + ", generation_v=" + generation_v
				+ ", generation_vi=" + generation_vi + ", generation_vii=" + generation_vii + ", generation_viii="
				+ generation_viii + "]";
	}

}
