package de.codeshelf.consoleui.prompt.builder;

import de.codeshelf.consoleui.elements.InputValue;

/**
 * Created by andy on 22.01.16.
 */
public class InputValueBuilder {
  private final PromptBuilder promptBuilder;
  private String name;
  private String defaultValue;
  private String message;
  private Character mask;

  public InputValueBuilder(PromptBuilder promptBuilder) {
    this.promptBuilder = promptBuilder;
  }

  public InputValueBuilder name(String name) {
    this.name = name;
    return this;
  }

  public InputValueBuilder defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  public InputValueBuilder message(String message) {
    this.message = message;
    return this;
  }

  public InputValueBuilder mask(char mask) {
    this.mask = mask;
    return this;
  }

  public PromptBuilder addPrompt() {
    InputValue inputValue = new InputValue(name, message, null, defaultValue);
    if (mask != null) {
      inputValue.setMask(mask);
    }
    promptBuilder.addPrompt(inputValue);
    return promptBuilder;
  }

}
