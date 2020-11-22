// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.5.0.0

namespace test {

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, EnumSimple value)
{
    if (value == EnumSimple::ENUM_VALUE_0) { stream << "ENUM_VALUE_0"; return stream; }
    if (value == EnumSimple::ENUM_VALUE_1) { stream << "ENUM_VALUE_1"; return stream; }
    if (value == EnumSimple::ENUM_VALUE_2) { stream << "ENUM_VALUE_2"; return stream; }
    if (value == EnumSimple::ENUM_VALUE_3) { stream << "ENUM_VALUE_3"; return stream; }
    if (value == EnumSimple::ENUM_VALUE_4) { stream << "ENUM_VALUE_4"; return stream; }
    if (value == EnumSimple::ENUM_VALUE_5) { stream << "ENUM_VALUE_5"; return stream; }
    stream << "<unknown>";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, EnumTyped value)
{
    if (value == EnumTyped::ENUM_VALUE_0) { stream << "ENUM_VALUE_0"; return stream; }
    if (value == EnumTyped::ENUM_VALUE_1) { stream << "ENUM_VALUE_1"; return stream; }
    if (value == EnumTyped::ENUM_VALUE_2) { stream << "ENUM_VALUE_2"; return stream; }
    if (value == EnumTyped::ENUM_VALUE_3) { stream << "ENUM_VALUE_3"; return stream; }
    if (value == EnumTyped::ENUM_VALUE_4) { stream << "ENUM_VALUE_4"; return stream; }
    if (value == EnumTyped::ENUM_VALUE_5) { stream << "ENUM_VALUE_5"; return stream; }
    stream << "<unknown>";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, EnumEmpty value)
{
    stream << "<unknown>";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, FlagsSimple value)
{
    bool first = true;
    if ((value & FlagsSimple::FLAG_VALUE_0) && ((value & FlagsSimple::FLAG_VALUE_0) == FlagsSimple::FLAG_VALUE_0))
    {
        stream << (first ? "" : "|") << "FLAG_VALUE_0";
        first = false;
    }
    if ((value & FlagsSimple::FLAG_VALUE_1) && ((value & FlagsSimple::FLAG_VALUE_1) == FlagsSimple::FLAG_VALUE_1))
    {
        stream << (first ? "" : "|") << "FLAG_VALUE_1";
        first = false;
    }
    if ((value & FlagsSimple::FLAG_VALUE_2) && ((value & FlagsSimple::FLAG_VALUE_2) == FlagsSimple::FLAG_VALUE_2))
    {
        stream << (first ? "" : "|") << "FLAG_VALUE_2";
        first = false;
    }
    if ((value & FlagsSimple::FLAG_VALUE_3) && ((value & FlagsSimple::FLAG_VALUE_3) == FlagsSimple::FLAG_VALUE_3))
    {
        stream << (first ? "" : "|") << "FLAG_VALUE_3";
        first = false;
    }
    if ((value & FlagsSimple::FLAG_VALUE_4) && ((value & FlagsSimple::FLAG_VALUE_4) == FlagsSimple::FLAG_VALUE_4))
    {
        stream << (first ? "" : "|") << "FLAG_VALUE_4";
        first = false;
    }
    if ((value & FlagsSimple::FLAG_VALUE_5) && ((value & FlagsSimple::FLAG_VALUE_5) == FlagsSimple::FLAG_VALUE_5))
    {
        stream << (first ? "" : "|") << "FLAG_VALUE_5";
        first = false;
    }
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, FlagsTyped value)
{
    bool first = true;
    if ((value & FlagsTyped::FLAG_VALUE_0) && ((value & FlagsTyped::FLAG_VALUE_0) == FlagsTyped::FLAG_VALUE_0))
    {
        stream << (first ? "" : "|") << "FLAG_VALUE_0";
        first = false;
    }
    if ((value & FlagsTyped::FLAG_VALUE_1) && ((value & FlagsTyped::FLAG_VALUE_1) == FlagsTyped::FLAG_VALUE_1))
    {
        stream << (first ? "" : "|") << "FLAG_VALUE_1";
        first = false;
    }
    if ((value & FlagsTyped::FLAG_VALUE_2) && ((value & FlagsTyped::FLAG_VALUE_2) == FlagsTyped::FLAG_VALUE_2))
    {
        stream << (first ? "" : "|") << "FLAG_VALUE_2";
        first = false;
    }
    if ((value & FlagsTyped::FLAG_VALUE_3) && ((value & FlagsTyped::FLAG_VALUE_3) == FlagsTyped::FLAG_VALUE_3))
    {
        stream << (first ? "" : "|") << "FLAG_VALUE_3";
        first = false;
    }
    if ((value & FlagsTyped::FLAG_VALUE_4) && ((value & FlagsTyped::FLAG_VALUE_4) == FlagsTyped::FLAG_VALUE_4))
    {
        stream << (first ? "" : "|") << "FLAG_VALUE_4";
        first = false;
    }
    if ((value & FlagsTyped::FLAG_VALUE_5) && ((value & FlagsTyped::FLAG_VALUE_5) == FlagsTyped::FLAG_VALUE_5))
    {
        stream << (first ? "" : "|") << "FLAG_VALUE_5";
        first = false;
    }
    if ((value & FlagsTyped::FLAG_VALUE_6) && ((value & FlagsTyped::FLAG_VALUE_6) == FlagsTyped::FLAG_VALUE_6))
    {
        stream << (first ? "" : "|") << "FLAG_VALUE_6";
        first = false;
    }
    if ((value & FlagsTyped::FLAG_VALUE_7) && ((value & FlagsTyped::FLAG_VALUE_7) == FlagsTyped::FLAG_VALUE_7))
    {
        stream << (first ? "" : "|") << "FLAG_VALUE_7";
        first = false;
    }
    if ((value & FlagsTyped::FLAG_VALUE_8) && ((value & FlagsTyped::FLAG_VALUE_8) == FlagsTyped::FLAG_VALUE_8))
    {
        stream << (first ? "" : "|") << "FLAG_VALUE_8";
        first = false;
    }
    if ((value & FlagsTyped::FLAG_VALUE_9) && ((value & FlagsTyped::FLAG_VALUE_9) == FlagsTyped::FLAG_VALUE_9))
    {
        stream << (first ? "" : "|") << "FLAG_VALUE_9";
        first = false;
    }
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, FlagsEmpty value)
{
    bool first = true;
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const StructSimple& value)
{
    stream << "StructSimple(";
    stream << "id="; stream << value.id;
    stream << ",f1="; stream << (value.f1 ? "true" : "false");
    stream << ",f2="; stream << (value.f2 ? "true" : "false");
    stream << ",f3="; stream << (int)value.f3;
    stream << ",f4="; stream << (int)value.f4;
    stream << ",f5="; stream << "'" << value.f5 << "'";
    stream << ",f6="; stream << "'" << value.f6 << "'";
    stream << ",f7="; stream << "'" << value.f7 << "'";
    stream << ",f8="; stream << "'" << value.f8 << "'";
    stream << ",f9="; stream << (int)value.f9;
    stream << ",f10="; stream << (int)value.f10;
    stream << ",f11="; stream << (int)value.f11;
    stream << ",f12="; stream << (int)value.f12;
    stream << ",f13="; stream << value.f13;
    stream << ",f14="; stream << value.f14;
    stream << ",f15="; stream << value.f15;
    stream << ",f16="; stream << value.f16;
    stream << ",f17="; stream << value.f17;
    stream << ",f18="; stream << value.f18;
    stream << ",f19="; stream << value.f19;
    stream << ",f20="; stream << value.f20;
    stream << ",f21="; stream << value.f21;
    stream << ",f22="; stream << value.f22;
    stream << ",f23="; stream << value.f23;
    stream << ",f24="; stream << value.f24;
    stream << ",f25="; stream << value.f25;
    stream << ",f26="; stream << value.f26;
    stream << ",f27="; stream << value.f27;
    stream << ",f28="; stream << value.f28;
    stream << ",f29="; stream << value.f29;
    stream << ",f30="; stream << value.f30;
    stream << ",f31="; stream << "\"" << value.f31 << "\"";
    stream << ",f32="; stream << "\"" << value.f32 << "\"";
    stream << ",f33="; stream << value.f33;
    stream << ",f34="; stream << value.f34;
    stream << ",f35="; stream << value.f35;
    stream << ",f36="; stream << "\"" << value.f36 << "\"";
    stream << ",f37="; stream << "\"" << value.f37 << "\"";
    stream << ",f38="; stream << "\"" << value.f38 << "\"";
    stream << ",f39="; stream << value.f39;
    stream << ",f40="; stream << value.f40;
    stream << ",f41="; stream << value.f41;
    stream << ",f42="; stream << value.f42;
    stream << ",f43="; stream << value.f43;
    stream << ",f44="; stream << value.f44;
    stream << ")";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const StructOptional& value)
{
    stream << "StructOptional(";
    stream << (const ::test::StructSimple&)value;
    stream << ",f100="; if (value.f100) stream << (*value.f100 ? "true" : "false"); else stream << "null";
    stream << ",f101="; if (value.f101) stream << (*value.f101 ? "true" : "false"); else stream << "null";
    stream << ",f102="; if (value.f102) stream << (*value.f102 ? "true" : "false"); else stream << "null";
    stream << ",f103="; if (value.f103) stream << (int)*value.f103; else stream << "null";
    stream << ",f104="; if (value.f104) stream << (int)*value.f104; else stream << "null";
    stream << ",f105="; if (value.f105) stream << (int)*value.f105; else stream << "null";
    stream << ",f106="; if (value.f106) stream << "'" << *value.f106 << "'"; else stream << "null";
    stream << ",f107="; if (value.f107) stream << "'" << *value.f107 << "'"; else stream << "null";
    stream << ",f108="; if (value.f108) stream << "'" << *value.f108 << "'"; else stream << "null";
    stream << ",f109="; if (value.f109) stream << "'" << *value.f109 << "'"; else stream << "null";
    stream << ",f110="; if (value.f110) stream << "'" << *value.f110 << "'"; else stream << "null";
    stream << ",f111="; if (value.f111) stream << "'" << *value.f111 << "'"; else stream << "null";
    stream << ",f112="; if (value.f112) stream << (int)*value.f112; else stream << "null";
    stream << ",f113="; if (value.f113) stream << (int)*value.f113; else stream << "null";
    stream << ",f114="; if (value.f114) stream << (int)*value.f114; else stream << "null";
    stream << ",f115="; if (value.f115) stream << (int)*value.f115; else stream << "null";
    stream << ",f116="; if (value.f116) stream << (int)*value.f116; else stream << "null";
    stream << ",f117="; if (value.f117) stream << (int)*value.f117; else stream << "null";
    stream << ",f118="; if (value.f118) stream << *value.f118; else stream << "null";
    stream << ",f119="; if (value.f119) stream << *value.f119; else stream << "null";
    stream << ",f120="; if (value.f120) stream << *value.f120; else stream << "null";
    stream << ",f121="; if (value.f121) stream << *value.f121; else stream << "null";
    stream << ",f122="; if (value.f122) stream << *value.f122; else stream << "null";
    stream << ",f123="; if (value.f123) stream << *value.f123; else stream << "null";
    stream << ",f124="; if (value.f124) stream << *value.f124; else stream << "null";
    stream << ",f125="; if (value.f125) stream << *value.f125; else stream << "null";
    stream << ",f126="; if (value.f126) stream << *value.f126; else stream << "null";
    stream << ",f127="; if (value.f127) stream << *value.f127; else stream << "null";
    stream << ",f128="; if (value.f128) stream << *value.f128; else stream << "null";
    stream << ",f129="; if (value.f129) stream << *value.f129; else stream << "null";
    stream << ",f130="; if (value.f130) stream << *value.f130; else stream << "null";
    stream << ",f131="; if (value.f131) stream << *value.f131; else stream << "null";
    stream << ",f132="; if (value.f132) stream << *value.f132; else stream << "null";
    stream << ",f133="; if (value.f133) stream << *value.f133; else stream << "null";
    stream << ",f134="; if (value.f134) stream << *value.f134; else stream << "null";
    stream << ",f135="; if (value.f135) stream << *value.f135; else stream << "null";
    stream << ",f136="; if (value.f136) stream << *value.f136; else stream << "null";
    stream << ",f137="; if (value.f137) stream << *value.f137; else stream << "null";
    stream << ",f138="; if (value.f138) stream << *value.f138; else stream << "null";
    stream << ",f139="; if (value.f139) stream << *value.f139; else stream << "null";
    stream << ",f140="; if (value.f140) stream << *value.f140; else stream << "null";
    stream << ",f141="; if (value.f141) stream << *value.f141; else stream << "null";
    stream << ",f142="; if (value.f142) stream << *value.f142; else stream << "null";
    stream << ",f143="; if (value.f143) stream << *value.f143; else stream << "null";
    stream << ",f144="; if (value.f144) stream << *value.f144; else stream << "null";
    stream << ",f145="; if (value.f145) stream << "\"" << *value.f145 << "\""; else stream << "null";
    stream << ",f146="; if (value.f146) stream << "\"" << *value.f146 << "\""; else stream << "null";
    stream << ",f147="; if (value.f147) stream << "\"" << *value.f147 << "\""; else stream << "null";
    stream << ",f148="; if (value.f148) stream << *value.f148; else stream << "null";
    stream << ",f149="; if (value.f149) stream << *value.f149; else stream << "null";
    stream << ",f150="; if (value.f150) stream << *value.f150; else stream << "null";
    stream << ",f151="; if (value.f151) stream << "\"" << *value.f151 << "\""; else stream << "null";
    stream << ",f152="; if (value.f152) stream << "\"" << *value.f152 << "\""; else stream << "null";
    stream << ",f153="; if (value.f153) stream << "\"" << *value.f153 << "\""; else stream << "null";
    stream << ",f154="; if (value.f154) stream << *value.f154; else stream << "null";
    stream << ",f155="; if (value.f155) stream << *value.f155; else stream << "null";
    stream << ",f156="; if (value.f156) stream << *value.f156; else stream << "null";
    stream << ",f157="; if (value.f157) stream << *value.f157; else stream << "null";
    stream << ",f158="; if (value.f158) stream << *value.f158; else stream << "null";
    stream << ",f159="; if (value.f159) stream << *value.f159; else stream << "null";
    stream << ",f160="; if (value.f160) stream << *value.f160; else stream << "null";
    stream << ",f161="; if (value.f161) stream << *value.f161; else stream << "null";
    stream << ",f162="; if (value.f162) stream << *value.f162; else stream << "null";
    stream << ",f163="; if (value.f163) stream << *value.f163; else stream << "null";
    stream << ",f164="; if (value.f164) stream << *value.f164; else stream << "null";
    stream << ",f165="; if (value.f165) stream << *value.f165; else stream << "null";
    stream << ")";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const StructNested& value)
{
    stream << "StructNested(";
    stream << (const ::test::StructOptional&)value;
    stream << ",f1000="; stream << value.f1000;
    stream << ",f1001="; if (value.f1001) stream << *value.f1001; else stream << "null";
    stream << ",f1002="; stream << value.f1002;
    stream << ",f1003="; if (value.f1003) stream << *value.f1003; else stream << "null";
    stream << ",f1004="; stream << value.f1004;
    stream << ",f1005="; if (value.f1005) stream << *value.f1005; else stream << "null";
    stream << ",f1006="; stream << value.f1006;
    stream << ",f1007="; if (value.f1007) stream << *value.f1007; else stream << "null";
    stream << ",f1008="; stream << value.f1008;
    stream << ",f1009="; if (value.f1009) stream << *value.f1009; else stream << "null";
    stream << ",f1010="; stream << value.f1010;
    stream << ",f1011="; if (value.f1011) stream << *value.f1011; else stream << "null";
    stream << ")";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const StructBytes& value)
{
    stream << "StructBytes(";
    stream << "f1="; stream << "bytes[" << value.f1.size() << "]";
    stream << ",f2="; if (value.f2) stream << "bytes[" << value.f2->size() << "]"; else stream << "null";
    stream << ",f3="; if (value.f3) stream << "bytes[" << value.f3->size() << "]"; else stream << "null";
    stream << ")";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const StructArray& value)
{
    stream << "StructArray(";
    {
        bool first = true;
        stream << "f1=[2][";
        for (size_t i = 0; i < 2; ++i)
        {
            stream << std::string(first ? "" : ",") << (int)value.f1[i];
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",f2=[2][";
        for (size_t i = 0; i < 2; ++i)
        {
            if (value.f2[i]) stream << std::string(first ? "" : ",") << (int)*value.f2[i]; else stream << std::string(first ? "" : ",") << "null";
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",f3=[2][";
        for (size_t i = 0; i < 2; ++i)
        {
            stream << std::string(first ? "" : ",") << "bytes[" << value.f3[i].size() << "]";
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",f4=[2][";
        for (size_t i = 0; i < 2; ++i)
        {
            if (value.f4[i]) stream << std::string(first ? "" : ",") << "bytes[" << value.f4[i]->size() << "]"; else stream << std::string(first ? "" : ",") << "null";
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",f5=[2][";
        for (size_t i = 0; i < 2; ++i)
        {
            stream << std::string(first ? "" : ",") << value.f5[i];
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",f6=[2][";
        for (size_t i = 0; i < 2; ++i)
        {
            if (value.f6[i]) stream << std::string(first ? "" : ",") << *value.f6[i]; else stream << std::string(first ? "" : ",") << "null";
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",f7=[2][";
        for (size_t i = 0; i < 2; ++i)
        {
            stream << std::string(first ? "" : ",") << value.f7[i];
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",f8=[2][";
        for (size_t i = 0; i < 2; ++i)
        {
            if (value.f8[i]) stream << std::string(first ? "" : ",") << *value.f8[i]; else stream << std::string(first ? "" : ",") << "null";
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",f9=[2][";
        for (size_t i = 0; i < 2; ++i)
        {
            stream << std::string(first ? "" : ",") << value.f9[i];
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",f10=[2][";
        for (size_t i = 0; i < 2; ++i)
        {
            if (value.f10[i]) stream << std::string(first ? "" : ",") << *value.f10[i]; else stream << std::string(first ? "" : ",") << "null";
            first = false;
        }
        stream << "]";
    }
    stream << ")";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const StructVector& value)
{
    stream << "StructVector(";
    {
        bool first = true;
        stream << "f1=[" << value.f1.size() << "][";
        for (const auto& it : value.f1)
        {
            stream << std::string(first ? "" : ",") << (int)it;
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",f2=[" << value.f2.size() << "][";
        for (const auto& it : value.f2)
        {
            if (it) stream << std::string(first ? "" : ",") << (int)*it; else stream << std::string(first ? "" : ",") << "null";
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",f3=[" << value.f3.size() << "][";
        for (const auto& it : value.f3)
        {
            stream << std::string(first ? "" : ",") << "bytes[" << it.size() << "]";
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",f4=[" << value.f4.size() << "][";
        for (const auto& it : value.f4)
        {
            if (it) stream << std::string(first ? "" : ",") << "bytes[" << it->size() << "]"; else stream << std::string(first ? "" : ",") << "null";
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",f5=[" << value.f5.size() << "][";
        for (const auto& it : value.f5)
        {
            stream << std::string(first ? "" : ",") << it;
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",f6=[" << value.f6.size() << "][";
        for (const auto& it : value.f6)
        {
            if (it) stream << std::string(first ? "" : ",") << *it; else stream << std::string(first ? "" : ",") << "null";
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",f7=[" << value.f7.size() << "][";
        for (const auto& it : value.f7)
        {
            stream << std::string(first ? "" : ",") << it;
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",f8=[" << value.f8.size() << "][";
        for (const auto& it : value.f8)
        {
            if (it) stream << std::string(first ? "" : ",") << *it; else stream << std::string(first ? "" : ",") << "null";
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",f9=[" << value.f9.size() << "][";
        for (const auto& it : value.f9)
        {
            stream << std::string(first ? "" : ",") << it;
            first = false;
        }
        stream << "]";
    }
    {
        bool first = true;
        stream << ",f10=[" << value.f10.size() << "][";
        for (const auto& it : value.f10)
        {
            if (it) stream << std::string(first ? "" : ",") << *it; else stream << std::string(first ? "" : ",") << "null";
            first = false;
        }
        stream << "]";
    }
    stream << ")";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const StructList& value)
{
    stream << "StructList(";
    {
        bool first = true;
        stream << "f1=[" << value.f1.size()<< "]<";
        for (const auto& it : value.f1)
        {
            stream << std::string(first ? "" : ",") << (int)it;
            first = false;
        }
        stream << ">";
    }
    {
        bool first = true;
        stream << ",f2=[" << value.f2.size()<< "]<";
        for (const auto& it : value.f2)
        {
            if (it) stream << std::string(first ? "" : ",") << (int)*it; else stream << std::string(first ? "" : ",") << "null";
            first = false;
        }
        stream << ">";
    }
    {
        bool first = true;
        stream << ",f3=[" << value.f3.size()<< "]<";
        for (const auto& it : value.f3)
        {
            stream << std::string(first ? "" : ",") << "bytes[" << it.size() << "]";
            first = false;
        }
        stream << ">";
    }
    {
        bool first = true;
        stream << ",f4=[" << value.f4.size()<< "]<";
        for (const auto& it : value.f4)
        {
            if (it) stream << std::string(first ? "" : ",") << "bytes[" << it->size() << "]"; else stream << std::string(first ? "" : ",") << "null";
            first = false;
        }
        stream << ">";
    }
    {
        bool first = true;
        stream << ",f5=[" << value.f5.size()<< "]<";
        for (const auto& it : value.f5)
        {
            stream << std::string(first ? "" : ",") << it;
            first = false;
        }
        stream << ">";
    }
    {
        bool first = true;
        stream << ",f6=[" << value.f6.size()<< "]<";
        for (const auto& it : value.f6)
        {
            if (it) stream << std::string(first ? "" : ",") << *it; else stream << std::string(first ? "" : ",") << "null";
            first = false;
        }
        stream << ">";
    }
    {
        bool first = true;
        stream << ",f7=[" << value.f7.size()<< "]<";
        for (const auto& it : value.f7)
        {
            stream << std::string(first ? "" : ",") << it;
            first = false;
        }
        stream << ">";
    }
    {
        bool first = true;
        stream << ",f8=[" << value.f8.size()<< "]<";
        for (const auto& it : value.f8)
        {
            if (it) stream << std::string(first ? "" : ",") << *it; else stream << std::string(first ? "" : ",") << "null";
            first = false;
        }
        stream << ">";
    }
    {
        bool first = true;
        stream << ",f9=[" << value.f9.size()<< "]<";
        for (const auto& it : value.f9)
        {
            stream << std::string(first ? "" : ",") << it;
            first = false;
        }
        stream << ">";
    }
    {
        bool first = true;
        stream << ",f10=[" << value.f10.size()<< "]<";
        for (const auto& it : value.f10)
        {
            if (it) stream << std::string(first ? "" : ",") << *it; else stream << std::string(first ? "" : ",") << "null";
            first = false;
        }
        stream << ">";
    }
    stream << ")";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const StructSet& value)
{
    stream << "StructSet(";
    {
        bool first = true;
        stream << "f1=[" << value.f1.size()<< "]{";
        for (const auto& it : value.f1)
        {
            stream << std::string(first ? "" : ",") << (int)it;
            first = false;
        }
        stream << "}";
    }
    {
        bool first = true;
        stream << ",f2=[" << value.f2.size()<< "]{";
        for (const auto& it : value.f2)
        {
            stream << std::string(first ? "" : ",") << it;
            first = false;
        }
        stream << "}";
    }
    {
        bool first = true;
        stream << ",f3=[" << value.f3.size()<< "]{";
        for (const auto& it : value.f3)
        {
            stream << std::string(first ? "" : ",") << it;
            first = false;
        }
        stream << "}";
    }
    {
        bool first = true;
        stream << ",f4=[" << value.f4.size()<< "]{";
        for (const auto& it : value.f4)
        {
            stream << std::string(first ? "" : ",") << it;
            first = false;
        }
        stream << "}";
    }
    stream << ")";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const StructMap& value)
{
    stream << "StructMap(";
    {
        bool first = true;
        stream << "f1=[" << value.f1.size()<< "]<{";
        for (const auto& it : value.f1)
        {
            stream << std::string(first ? "" : ",") << it.first;
            stream << "->";
            stream << (int)it.second;
            first = false;
        }
        stream << "}>";
    }
    {
        bool first = true;
        stream << ",f2=[" << value.f2.size()<< "]<{";
        for (const auto& it : value.f2)
        {
            stream << std::string(first ? "" : ",") << it.first;
            stream << "->";
            if (it.second) stream << (int)*it.second; else stream << "null";
            first = false;
        }
        stream << "}>";
    }
    {
        bool first = true;
        stream << ",f3=[" << value.f3.size()<< "]<{";
        for (const auto& it : value.f3)
        {
            stream << std::string(first ? "" : ",") << it.first;
            stream << "->";
            stream << "bytes[" << it.second.size() << "]";
            first = false;
        }
        stream << "}>";
    }
    {
        bool first = true;
        stream << ",f4=[" << value.f4.size()<< "]<{";
        for (const auto& it : value.f4)
        {
            stream << std::string(first ? "" : ",") << it.first;
            stream << "->";
            if (it.second) stream << "bytes[" << it.second->size() << "]"; else stream << "null";
            first = false;
        }
        stream << "}>";
    }
    {
        bool first = true;
        stream << ",f5=[" << value.f5.size()<< "]<{";
        for (const auto& it : value.f5)
        {
            stream << std::string(first ? "" : ",") << it.first;
            stream << "->";
            stream << it.second;
            first = false;
        }
        stream << "}>";
    }
    {
        bool first = true;
        stream << ",f6=[" << value.f6.size()<< "]<{";
        for (const auto& it : value.f6)
        {
            stream << std::string(first ? "" : ",") << it.first;
            stream << "->";
            if (it.second) stream << *it.second; else stream << "null";
            first = false;
        }
        stream << "}>";
    }
    {
        bool first = true;
        stream << ",f7=[" << value.f7.size()<< "]<{";
        for (const auto& it : value.f7)
        {
            stream << std::string(first ? "" : ",") << it.first;
            stream << "->";
            stream << it.second;
            first = false;
        }
        stream << "}>";
    }
    {
        bool first = true;
        stream << ",f8=[" << value.f8.size()<< "]<{";
        for (const auto& it : value.f8)
        {
            stream << std::string(first ? "" : ",") << it.first;
            stream << "->";
            if (it.second) stream << *it.second; else stream << "null";
            first = false;
        }
        stream << "}>";
    }
    {
        bool first = true;
        stream << ",f9=[" << value.f9.size()<< "]<{";
        for (const auto& it : value.f9)
        {
            stream << std::string(first ? "" : ",") << it.first;
            stream << "->";
            stream << it.second;
            first = false;
        }
        stream << "}>";
    }
    {
        bool first = true;
        stream << ",f10=[" << value.f10.size()<< "]<{";
        for (const auto& it : value.f10)
        {
            stream << std::string(first ? "" : ",") << it.first;
            stream << "->";
            if (it.second) stream << *it.second; else stream << "null";
            first = false;
        }
        stream << "}>";
    }
    stream << ")";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const StructHash& value)
{
    stream << "StructHash(";
    {
        bool first = true;
        stream << "f1=[" << value.f1.size()<< "][{";
        for (const auto& it : value.f1)
        {
            stream << std::string(first ? "" : ",") << "\"" << it.first << "\"";
            stream << "->";
            stream << (int)it.second;
            first = false;
        }
        stream << "}]";
    }
    {
        bool first = true;
        stream << ",f2=[" << value.f2.size()<< "][{";
        for (const auto& it : value.f2)
        {
            stream << std::string(first ? "" : ",") << "\"" << it.first << "\"";
            stream << "->";
            if (it.second) stream << (int)*it.second; else stream << "null";
            first = false;
        }
        stream << "}]";
    }
    {
        bool first = true;
        stream << ",f3=[" << value.f3.size()<< "][{";
        for (const auto& it : value.f3)
        {
            stream << std::string(first ? "" : ",") << "\"" << it.first << "\"";
            stream << "->";
            stream << "bytes[" << it.second.size() << "]";
            first = false;
        }
        stream << "}]";
    }
    {
        bool first = true;
        stream << ",f4=[" << value.f4.size()<< "][{";
        for (const auto& it : value.f4)
        {
            stream << std::string(first ? "" : ",") << "\"" << it.first << "\"";
            stream << "->";
            if (it.second) stream << "bytes[" << it.second->size() << "]"; else stream << "null";
            first = false;
        }
        stream << "}]";
    }
    {
        bool first = true;
        stream << ",f5=[" << value.f5.size()<< "][{";
        for (const auto& it : value.f5)
        {
            stream << std::string(first ? "" : ",") << "\"" << it.first << "\"";
            stream << "->";
            stream << it.second;
            first = false;
        }
        stream << "}]";
    }
    {
        bool first = true;
        stream << ",f6=[" << value.f6.size()<< "][{";
        for (const auto& it : value.f6)
        {
            stream << std::string(first ? "" : ",") << "\"" << it.first << "\"";
            stream << "->";
            if (it.second) stream << *it.second; else stream << "null";
            first = false;
        }
        stream << "}]";
    }
    {
        bool first = true;
        stream << ",f7=[" << value.f7.size()<< "][{";
        for (const auto& it : value.f7)
        {
            stream << std::string(first ? "" : ",") << "\"" << it.first << "\"";
            stream << "->";
            stream << it.second;
            first = false;
        }
        stream << "}]";
    }
    {
        bool first = true;
        stream << ",f8=[" << value.f8.size()<< "][{";
        for (const auto& it : value.f8)
        {
            stream << std::string(first ? "" : ",") << "\"" << it.first << "\"";
            stream << "->";
            if (it.second) stream << *it.second; else stream << "null";
            first = false;
        }
        stream << "}]";
    }
    {
        bool first = true;
        stream << ",f9=[" << value.f9.size()<< "][{";
        for (const auto& it : value.f9)
        {
            stream << std::string(first ? "" : ",") << "\"" << it.first << "\"";
            stream << "->";
            stream << it.second;
            first = false;
        }
        stream << "}]";
    }
    {
        bool first = true;
        stream << ",f10=[" << value.f10.size()<< "][{";
        for (const auto& it : value.f10)
        {
            stream << std::string(first ? "" : ",") << "\"" << it.first << "\"";
            stream << "->";
            if (it.second) stream << *it.second; else stream << "null";
            first = false;
        }
        stream << "}]";
    }
    stream << ")";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const StructHashEx& value)
{
    stream << "StructHashEx(";
    {
        bool first = true;
        stream << "f1=[" << value.f1.size()<< "][{";
        for (const auto& it : value.f1)
        {
            stream << std::string(first ? "" : ",") << it.first;
            stream << "->";
            stream << it.second;
            first = false;
        }
        stream << "}]";
    }
    {
        bool first = true;
        stream << ",f2=[" << value.f2.size()<< "][{";
        for (const auto& it : value.f2)
        {
            stream << std::string(first ? "" : ",") << it.first;
            stream << "->";
            if (it.second) stream << *it.second; else stream << "null";
            first = false;
        }
        stream << "}]";
    }
    stream << ")";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const StructEmpty& value)
{
    stream << "StructEmpty(";
    stream << ")";
    return stream;
}

} // namespace test
