// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.5.0.0

package test

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// Fast Binary Encoding test final sender
type FinalSender struct {
    *fbe.Sender
    protoSender *proto.FinalSender
}

// Create a new test final sender with an empty buffer
func NewFinalSender() *FinalSender {
    return NewFinalSenderWithBuffer(fbe.NewEmptyBuffer())
}

// Create a new test final sender with the given buffer
func NewFinalSenderWithBuffer(buffer *fbe.Buffer) *FinalSender {
    return &FinalSender{
        fbe.NewSender(buffer, true),
        proto.NewFinalSenderWithBuffer(buffer),
    }
}

// Imported senders

func (s *FinalSender) ProtoSender() *proto.FinalSender { return s.protoSender }

// Sender models accessors


// Send methods

func (s *FinalSender) Send(value interface{}) (int, error) {
    switch value := value.(type) {
    default:
        _ = value
        break
    }
    if result, err := s.protoSender.Send(value); (result > 0) || (err != nil) {
        return result, err
    }
    return 0, nil
}
