package rm_school_api.exceptions;

public record ValidationError(
        String field,
        String message
) {
}
