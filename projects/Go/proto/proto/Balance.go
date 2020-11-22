// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.5.0.0

package proto

import "fmt"
import "strconv"
import "strings"
import "errors"
import "../fbe"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version

// Workaround for Go unused imports issue
var _ = fmt.Print
var _ = strconv.FormatInt

// Balance key
type BalanceKey struct {
    Currency string
}

// Convert Balance flags key to string
func (k *BalanceKey) String() string {
    var sb strings.Builder
    sb.WriteString("BalanceKey(")
    sb.WriteString("currency=")
    sb.WriteString("\"" + k.Currency + "\"")
    sb.WriteString(")")
    return sb.String()
}

// Balance struct
type Balance struct {
    Currency string `json:"currency"`
    Amount float64 `json:"amount"`
}

// Create a new Balance struct
func NewBalance() *Balance {
    return &Balance{
        Currency: "",
        Amount: float64(0.0),
    }
}

// Create a new Balance struct from the given field values
func NewBalanceFromFieldValues(Currency string, Amount float64) *Balance {
    return &Balance{Currency, Amount}
}

// Create a new Balance struct from JSON
func NewBalanceFromJSON(buffer []byte) (*Balance, error) {
    result := *NewBalance()
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return nil, err
    }
    return &result, nil
}

// Struct shallow copy
func (s *Balance) Copy() *Balance {
    var result = *s
    return &result
}

// Struct deep clone
func (s *Balance) Clone() *Balance {
    // Serialize the struct to the FBE stream
    writer := NewBalanceModel(fbe.NewEmptyBuffer())
    _, _ = writer.Serialize(s)

    // Deserialize the struct from the FBE stream
    reader := NewBalanceModel(writer.Buffer())
    result, _, _ := reader.Deserialize()
    return result
}

// Get the struct key
func (s *Balance) Key() BalanceKey {
    return BalanceKey{
        Currency: s.Currency,
    }
}

// Convert struct to optional
func (s *Balance) Optional() *Balance {
    return s
}

// Get the FBE type
func (s *Balance) FBEType() int { return 2 }

// Convert struct to string
func (s *Balance) String() string {
    var sb strings.Builder
    sb.WriteString("Balance(")
    sb.WriteString("currency=")
    sb.WriteString("\"" + s.Currency + "\"")
    sb.WriteString(",amount=")
    sb.WriteString(strconv.FormatFloat(float64(s.Amount), 'g', -1, 64))
    sb.WriteString(")")
    return sb.String()
}

// Convert struct to JSON
func (s *Balance) JSON() ([]byte, error) {
    return fbe.Json.Marshal(s)
}
