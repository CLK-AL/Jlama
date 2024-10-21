package com.github.tjake.jlama.model.qwen2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.tjake.jlama.math.ActivationFunction;
import com.github.tjake.jlama.safetensors.Config;

import java.util.List;

public class Qwen2Config extends Config {

    @JsonCreator
    public Qwen2Config(
            @JsonProperty("max_position_embeddings") int contextLength,
            @JsonProperty("hidden_size") int embeddingLength,
            @JsonProperty("intermediate_size") int hiddenLength,
            @JsonProperty("num_attention_heads") int numberOfHeads,
            @JsonProperty("num_key_value_heads") int numberOfKeyValueHeads,
            @JsonProperty("num_hidden_layers") int numberOfLayers,
            @JsonProperty("rms_norm_eps") float layerNormEps,
            @JsonProperty("vocab_size") int vocabularySize,
            @JsonProperty("bos_token_id") int bosToken,
            @JsonProperty("eos_token_id") int eosToken,
            @JsonProperty("hidden_act") ActivationFunction.Type activationFunction,
            @JsonProperty("rope_theta") Double ropeTheta) {
        super(
                contextLength,
                embeddingLength,
                hiddenLength,
                numberOfHeads,
                numberOfKeyValueHeads,
                numberOfLayers,
                layerNormEps,
                vocabularySize,
                bosToken,
                List.of(eosToken),
                activationFunction,
                ropeTheta,
                1.0,
                null,
                embeddingLength / numberOfHeads,
                null, null
        );
    }
}
