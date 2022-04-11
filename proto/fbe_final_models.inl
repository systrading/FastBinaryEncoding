//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

namespace FBE {

template <typename T, typename TBase>
inline size_t FinalModelBase<T, TBase>::verify() const noexcept
{
    if ((_buffer.offset() + fbe_offset() + fbe_size()) > _buffer.size())
        return std::numeric_limits<std::size_t>::max();

    return fbe_size();
}

template <typename T, typename TBase>
inline size_t FinalModelBase<T, TBase>::get(T& value) const noexcept
{
    if ((_buffer.offset() + fbe_offset() + fbe_size()) > _buffer.size())
        return 0;

    value = (T)(*((const TBase*)(_buffer.data() + _buffer.offset() + fbe_offset())));
    return fbe_size();
}

template <typename T, typename TBase>
inline size_t FinalModelBase<T, TBase>::set(T value) noexcept
{
    assert(((_buffer.offset() + fbe_offset() + fbe_size()) <= _buffer.size()) && "Model is broken!");
    if ((_buffer.offset() + fbe_offset() + fbe_size()) > _buffer.size())
        return 0;

    *((TBase*)(_buffer.data() + _buffer.offset() + fbe_offset())) = (TBase)value;
    return fbe_size();
}

template <typename T>
inline bool FinalModel<std::optional<T>>::has_value() const noexcept
{
    if ((_buffer.offset() + fbe_offset() + 1) > _buffer.size())
        return false;

    uint8_t fbe_has_value = *((const uint8_t*)(_buffer.data() + _buffer.offset() + fbe_offset()));
    return (fbe_has_value != 0);
}

template <typename T>
inline size_t FinalModel<std::optional<T>>::verify() const noexcept
{
    if ((_buffer.offset() + fbe_offset() + 1) > _buffer.size())
        return std::numeric_limits<std::size_t>::max();

    uint8_t fbe_has_value = *((const uint8_t*)(_buffer.data() + _buffer.offset() + fbe_offset()));
    if (fbe_has_value == 0)
        return 1;

    _buffer.shift(fbe_offset() + 1);
    size_t fbe_result = value.verify();
    _buffer.unshift(fbe_offset() + 1);
    return 1 + fbe_result;
}

template <typename T>
inline size_t FinalModel<std::optional<T>>::get(std::optional<T>& opt) const noexcept
{
    opt = std::nullopt;

    assert(((_buffer.offset() + fbe_offset() + 1) <= _buffer.size()) && "Model is broken!");
    if ((_buffer.offset() + fbe_offset() + 1) > _buffer.size())
        return 0;

    if (!has_value())
        return 1;

    _buffer.shift(fbe_offset() + 1);
    T temp = T();
    size_t size = value.get(temp);
    opt.emplace(temp);
    _buffer.unshift(fbe_offset() + 1);
    return 1 + size;
}

template <typename T>
inline size_t FinalModel<std::optional<T>>::set(const std::optional<T>& opt)
{
    assert(((_buffer.offset() + fbe_offset() + 1) <= _buffer.size()) && "Model is broken!");
    if ((_buffer.offset() + fbe_offset() + 1) > _buffer.size())
        return 0;

    uint8_t fbe_has_value = opt ? 1 : 0;
    *((uint8_t*)(_buffer.data() + _buffer.offset() + fbe_offset())) = fbe_has_value;
    if (fbe_has_value == 0)
        return 1;

    _buffer.shift(fbe_offset() + 1);
    size_t size = 0;
    if (opt)
        size = value.set(opt.value());
    _buffer.unshift(fbe_offset() + 1);
    return 1 + size;
}

template <typename T, size_t N>
template <size_t S>
inline size_t FinalModelArray<T, N>::fbe_allocation_size(const T (&values)[S]) const noexcept
{
    size_t size = 0;
    FinalModel<T> fbe_model(_buffer, fbe_offset());
    for (size_t i = 0; (i < S) && (i < N); ++i)
        size += fbe_model.fbe_allocation_size(values[i]);
    return size;
}

template <typename T, size_t N>
template <size_t S>
inline size_t FinalModelArray<T, N>::fbe_allocation_size(const std::array<T, S>& values) const noexcept
{
    size_t size = 0;
    FinalModel<T> fbe_model(_buffer, fbe_offset());
    for (size_t i = 0; (i < S) && (i < N); ++i)
        size += fbe_model.fbe_allocation_size(values[i]);
    return size;
}

template <typename T, size_t N>
inline size_t FinalModelArray<T, N>::fbe_allocation_size(const std::vector<T>& values) const noexcept
{
    size_t size = 0;
    FinalModel<T> fbe_model(_buffer, fbe_offset());
    for (size_t i = 0; (i < values.size()) && (i < N); ++i)
        size += fbe_model.fbe_allocation_size(values[i]);
    return size;
}

template <typename T, size_t N>
inline size_t FinalModelArray<T, N>::verify() const noexcept
{
    if ((_buffer.offset() + fbe_offset()) > _buffer.size())
        return std::numeric_limits<std::size_t>::max();

    size_t size = 0;
    FinalModel<T> fbe_model(_buffer, fbe_offset());
    for (size_t i = N; i-- > 0;)
    {
        size_t offset = fbe_model.verify();
        if (offset == std::numeric_limits<std::size_t>::max())
            return std::numeric_limits<std::size_t>::max();
        fbe_model.fbe_shift(offset);
        size += offset;
    }
    return size;
}

template <typename T, size_t N>
template <size_t S>
inline size_t FinalModelArray<T, N>::get(T (&values)[S]) const noexcept
{
    assert(((_buffer.offset() + fbe_offset()) <= _buffer.size()) && "Model is broken!");
    if ((_buffer.offset() + fbe_offset()) > _buffer.size())
        return 0;

    size_t size = 0;
    FinalModel<T> fbe_model(_buffer, fbe_offset());
    for (size_t i = 0; (i < S) && (i < N); ++i)
    {
        size_t offset = fbe_model.get(values[i]);
        fbe_model.fbe_shift(offset);
        size += offset;
    }
    return size;
}

template <typename T, size_t N>
template <size_t S>
inline size_t FinalModelArray<T, N>::get(std::array<T, S>& values) const noexcept
{
    assert(((_buffer.offset() + fbe_offset()) <= _buffer.size()) && "Model is broken!");
    if ((_buffer.offset() + fbe_offset()) > _buffer.size())
        return 0;

    size_t size = 0;
    FinalModel<T> fbe_model(_buffer, fbe_offset());
    for (size_t i = 0; (i < S) && (i < N); ++i)
    {
        size_t offset = fbe_model.get(values[i]);
        fbe_model.fbe_shift(offset);
        size += offset;
    }
    return size;
}

template <typename T, size_t N>
inline size_t FinalModelArray<T, N>::get(std::vector<T>& values) const noexcept
{
    values.clear();

    assert(((_buffer.offset() + fbe_offset()) <= _buffer.size()) && "Model is broken!");
    if ((_buffer.offset() + fbe_offset()) > _buffer.size())
        return 0;

    values.reserve(N);

    size_t size = 0;
    FinalModel<T> fbe_model(_buffer, fbe_offset());
    for (size_t i = N; i-- > 0;)
    {
        T value = T();
        size_t offset = fbe_model.get(value);
        values.emplace_back(value);
        fbe_model.fbe_shift(offset);
        size += offset;
    }
    return size;
}

template <typename T, size_t N>
template <size_t S>
inline size_t FinalModelArray<T, N>::set(const T (&values)[S]) noexcept
{
    assert(((_buffer.offset() + fbe_offset()) <= _buffer.size()) && "Model is broken!");
    if ((_buffer.offset() + fbe_offset()) > _buffer.size())
        return 0;

    size_t size = 0;
    FinalModel<T> fbe_model(_buffer, fbe_offset());
    for (size_t i = 0; (i < S) && (i < N); ++i)
    {
        size_t offset = fbe_model.set(values[i]);
        fbe_model.fbe_shift(offset);
        size += offset;
    }
    return size;
}

template <typename T, size_t N>
template <size_t S>
inline size_t FinalModelArray<T, N>::set(const std::array<T, S>& values) noexcept
{
    assert(((_buffer.offset() + fbe_offset()) <= _buffer.size()) && "Model is broken!");
    if ((_buffer.offset() + fbe_offset()) > _buffer.size())
        return 0;

    size_t size = 0;
    FinalModel<T> fbe_model(_buffer, fbe_offset());
    for (size_t i = 0; (i < S) && (i < N); ++i)
    {
        size_t offset = fbe_model.set(values[i]);
        fbe_model.fbe_shift(offset);
        size += offset;
    }
    return size;
}

template <typename T, size_t N>
inline size_t FinalModelArray<T, N>::set(const std::vector<T>& values) noexcept
{
    assert(((_buffer.offset() + fbe_offset()) <= _buffer.size()) && "Model is broken!");
    if ((_buffer.offset() + fbe_offset()) > _buffer.size())
        return 0;

    size_t size = 0;
    FinalModel<T> fbe_model(_buffer, fbe_offset());
    for (size_t i = 0; (i < values.size()) && (i < N); ++i)
    {
        size_t offset = fbe_model.set(values[i]);
        fbe_model.fbe_shift(offset);
        size += offset;
    }
    return size;
}

template <typename T>
inline size_t FinalModelVector<T>::fbe_allocation_size(const std::vector<T>& values) const noexcept
{
    size_t size = 4;
    FinalModel<T> fbe_model(_buffer, fbe_offset() + 4);
    for (const auto& value : values)
        size += fbe_model.fbe_allocation_size(value);
    return size;
}

template <typename T>
inline size_t FinalModelVector<T>::fbe_allocation_size(const std::list<T>& values) const noexcept
{
    size_t size = 4;
    FinalModel<T> fbe_model(_buffer, fbe_offset() + 4);
    for (const auto& value : values)
        size += fbe_model.fbe_allocation_size(value);
    return size;
}

template <typename T>
inline size_t FinalModelVector<T>::fbe_allocation_size(const std::set<T>& values) const noexcept
{
    size_t size = 4;
    FinalModel<T> fbe_model(_buffer, fbe_offset() + 4);
    for (const auto& value : values)
        size += fbe_model.fbe_allocation_size(value);
    return size;
}

template <typename T>
inline size_t FinalModelVector<T>::verify() const noexcept
{
    if ((_buffer.offset() + fbe_offset() + 4) > _buffer.size())
        return std::numeric_limits<std::size_t>::max();

    uint32_t fbe_vector_size = *((const uint32_t*)(_buffer.data() + _buffer.offset() + fbe_offset()));

    size_t size = 4;
    FinalModel<T> fbe_model(_buffer, fbe_offset() + 4);
    for (size_t i = fbe_vector_size; i-- > 0;)
    {
        size_t offset = fbe_model.verify();
        if (offset == std::numeric_limits<std::size_t>::max())
            return std::numeric_limits<std::size_t>::max();
        fbe_model.fbe_shift(offset);
        size += offset;
    }
    return size;
}

template <typename T>
inline size_t FinalModelVector<T>::get(std::vector<T>& values) const noexcept
{
    values.clear();

    assert(((_buffer.offset() + fbe_offset() + 4) <= _buffer.size()) && "Model is broken!");
    if ((_buffer.offset() + fbe_offset() + 4) > _buffer.size())
        return 0;

    size_t fbe_vector_size = *((const uint32_t*)(_buffer.data() + _buffer.offset() + fbe_offset()));
    if (fbe_vector_size == 0)
        return 4;

    values.reserve(fbe_vector_size);

    size_t size = 4;
    FinalModel<T> fbe_model(_buffer, fbe_offset() + 4);
    for (size_t i = fbe_vector_size; i-- > 0;)
    {
        T value = T();
        size_t offset = fbe_model.get(value);
        values.emplace_back(value);
        fbe_model.fbe_shift(offset);
        size += offset;
    }
    return size;
}

template <typename T>
inline size_t FinalModelVector<T>::get(std::list<T>& values) const noexcept
{
    values.clear();

    assert(((_buffer.offset() + fbe_offset() + 4) <= _buffer.size()) && "Model is broken!");
    if ((_buffer.offset() + fbe_offset() + 4) > _buffer.size())
        return 0;

    size_t fbe_vector_size = *((const uint32_t*)(_buffer.data() + _buffer.offset() + fbe_offset()));
    if (fbe_vector_size == 0)
        return 4;

    size_t size = 4;
    FinalModel<T> fbe_model(_buffer, fbe_offset() + 4);
    for (size_t i = fbe_vector_size; i-- > 0;)
    {
        T value = T();
        size_t offset = fbe_model.get(value);
        values.emplace_back(value);
        fbe_model.fbe_shift(offset);
        size += offset;
    }
    return size;
}

template <typename T>
inline size_t FinalModelVector<T>::get(std::set<T>& values) const noexcept
{
    values.clear();

    assert(((_buffer.offset() + fbe_offset() + 4) <= _buffer.size()) && "Model is broken!");
    if ((_buffer.offset() + fbe_offset() + 4) > _buffer.size())
        return 0;

    size_t fbe_vector_size = *((const uint32_t*)(_buffer.data() + _buffer.offset() + fbe_offset()));
    if (fbe_vector_size == 0)
        return 4;

    size_t size = 4;
    FinalModel<T> fbe_model(_buffer, fbe_offset() + 4);
    for (size_t i = fbe_vector_size; i-- > 0;)
    {
        T value = T();
        size_t offset = fbe_model.get(value);
        values.emplace(value);
        fbe_model.fbe_shift(offset);
        size += offset;
    }
    return size;
}

template <typename T>
inline size_t FinalModelVector<T>::set(const std::vector<T>& values) noexcept
{
    assert(((_buffer.offset() + fbe_offset() + 4) <= _buffer.size()) && "Model is broken!");
    if ((_buffer.offset() + fbe_offset() + 4) > _buffer.size())
        return 0;

    *((uint32_t*)(_buffer.data() + _buffer.offset() + fbe_offset())) = (uint32_t)values.size();

    size_t size = 4;
    FinalModel<T> fbe_model(_buffer, fbe_offset() + 4);
    for (const auto& value : values)
    {
        size_t offset = fbe_model.set(value);
        fbe_model.fbe_shift(offset);
        size += offset;
    }
    return size;
}

template <typename T>
inline size_t FinalModelVector<T>::set(const std::list<T>& values) noexcept
{
    assert(((_buffer.offset() + fbe_offset() + 4) <= _buffer.size()) && "Model is broken!");
    if ((_buffer.offset() + fbe_offset() + 4) > _buffer.size())
        return 0;

    *((uint32_t*)(_buffer.data() + _buffer.offset() + fbe_offset())) = (uint32_t)values.size();

    size_t size = 4;
    FinalModel<T> fbe_model(_buffer, fbe_offset() + 4);
    for (const auto& value : values)
    {
        size_t offset = fbe_model.set(value);
        fbe_model.fbe_shift(offset);
        size += offset;
    }
    return size;
}

template <typename T>
inline size_t FinalModelVector<T>::set(const std::set<T>& values) noexcept
{
    assert(((_buffer.offset() + fbe_offset() + 4) <= _buffer.size()) && "Model is broken!");
    if ((_buffer.offset() + fbe_offset() + 4) > _buffer.size())
        return 0;

    *((uint32_t*)(_buffer.data() + _buffer.offset() + fbe_offset())) = (uint32_t)values.size();

    size_t size = 4;
    FinalModel<T> fbe_model(_buffer, fbe_offset() + 4);
    for (const auto& value : values)
    {
        size_t offset = fbe_model.set(value);
        fbe_model.fbe_shift(offset);
        size += offset;
    }
    return size;
}

template <typename TKey, typename TValue>
inline size_t FinalModelMap<TKey, TValue>::fbe_allocation_size(const std::map<TKey, TValue>& values) const noexcept
{
    size_t size = 4;
    FinalModel<TKey> fbe_model_key(_buffer, fbe_offset() + 4);
    FinalModel<TValue> fbe_model_value(_buffer, fbe_offset() + 4);
    for (const auto& value : values)
    {
        size += fbe_model_key.fbe_allocation_size(value.first);
        size += fbe_model_value.fbe_allocation_size(value.second);
    }
    return size;
}

template <typename TKey, typename TValue>
inline size_t FinalModelMap<TKey, TValue>::fbe_allocation_size(const std::unordered_map<TKey, TValue>& values) const noexcept
{
    size_t size = 4;
    FinalModel<TKey> fbe_model_key(_buffer, fbe_offset() + 4);
    FinalModel<TValue> fbe_model_value(_buffer, fbe_offset() + 4);
    for (const auto& value : values)
    {
        size += fbe_model_key.fbe_allocation_size(value.first);
        size += fbe_model_value.fbe_allocation_size(value.second);
    }
    return size;
}

template <typename TKey, typename TValue>
inline size_t FinalModelMap<TKey, TValue>::verify() const noexcept
{
    if ((_buffer.offset() + fbe_offset() + 4) > _buffer.size())
        return std::numeric_limits<std::size_t>::max();

    uint32_t fbe_map_size = *((const uint32_t*)(_buffer.data() + _buffer.offset() + fbe_offset()));

    size_t size = 4;
    FinalModel<TKey> fbe_model_key(_buffer, fbe_offset() + 4);
    FinalModel<TValue> fbe_model_value(_buffer, fbe_offset() + 4);
    for (size_t i = fbe_map_size; i-- > 0;)
    {
        size_t offset_key = fbe_model_key.verify();
        if (offset_key == std::numeric_limits<std::size_t>::max())
            return std::numeric_limits<std::size_t>::max();
        fbe_model_key.fbe_shift(offset_key);
        fbe_model_value.fbe_shift(offset_key);
        size += offset_key;
        size_t offset_value = fbe_model_value.verify();
        if (offset_value == std::numeric_limits<std::size_t>::max())
            return std::numeric_limits<std::size_t>::max();
        fbe_model_key.fbe_shift(offset_value);
        fbe_model_value.fbe_shift(offset_value);
        size += offset_value;
    }
    return size;
}

template <typename TKey, typename TValue>
inline size_t FinalModelMap<TKey, TValue>::get(std::map<TKey, TValue>& values) const noexcept
{
    values.clear();

    assert(((_buffer.offset() + fbe_offset() + 4) <= _buffer.size()) && "Model is broken!");
    if ((_buffer.offset() + fbe_offset() + 4) > _buffer.size())
        return 0;

    size_t fbe_map_size = *((const uint32_t*)(_buffer.data() + _buffer.offset() + fbe_offset()));
    if (fbe_map_size == 0)
        return 4;

    size_t size = 4;
    FinalModel<TKey> fbe_model_key(_buffer, fbe_offset() + 4);
    FinalModel<TValue> fbe_model_value(_buffer, fbe_offset() + 4);
    for (size_t i = fbe_map_size; i-- > 0;)
    {
        TKey key;
        TValue value;
        size_t offset_key = fbe_model_key.get(key);
        fbe_model_key.fbe_shift(offset_key);
        fbe_model_value.fbe_shift(offset_key);
        size_t offset_value = fbe_model_value.get(value);
        fbe_model_key.fbe_shift(offset_value);
        fbe_model_value.fbe_shift(offset_value);
        values.emplace(key, value);
        size += offset_key + offset_value;
    }
    return size;
}

template <typename TKey, typename TValue>
inline size_t FinalModelMap<TKey, TValue>::get(std::unordered_map<TKey, TValue>& values) const noexcept
{
    values.clear();

    assert(((_buffer.offset() + fbe_offset() + 4) <= _buffer.size()) && "Model is broken!");
    if ((_buffer.offset() + fbe_offset() + 4) > _buffer.size())
        return 0;

    size_t fbe_map_size = *((const uint32_t*)(_buffer.data() + _buffer.offset() + fbe_offset()));
    if (fbe_map_size == 0)
        return 4;

    size_t size = 4;
    FinalModel<TKey> fbe_model_key(_buffer, fbe_offset() + 4);
    FinalModel<TValue> fbe_model_value(_buffer, fbe_offset() + 4);
    for (size_t i = fbe_map_size; i-- > 0;)
    {
        TKey key;
        TValue value;
        size_t offset_key = fbe_model_key.get(key);
        fbe_model_key.fbe_shift(offset_key);
        fbe_model_value.fbe_shift(offset_key);
        size_t offset_value = fbe_model_value.get(value);
        fbe_model_key.fbe_shift(offset_value);
        fbe_model_value.fbe_shift(offset_value);
        values.emplace(key, value);
        size += offset_key + offset_value;
    }
    return size;
}

template <typename TKey, typename TValue>
inline size_t FinalModelMap<TKey, TValue>::set(const std::map<TKey, TValue>& values) noexcept
{
    assert(((_buffer.offset() + fbe_offset() + 4) <= _buffer.size()) && "Model is broken!");
    if ((_buffer.offset() + fbe_offset() + 4) > _buffer.size())
        return 0;

    *((uint32_t*)(_buffer.data() + _buffer.offset() + fbe_offset())) = (uint32_t)values.size();

    size_t size = 4;
    FinalModel<TKey> fbe_model_key(_buffer, fbe_offset() + 4);
    FinalModel<TValue> fbe_model_value(_buffer, fbe_offset() + 4);
    for (const auto& value : values)
    {
        size_t offset_key = fbe_model_key.set(value.first);
        fbe_model_key.fbe_shift(offset_key);
        fbe_model_value.fbe_shift(offset_key);
        size_t offset_value = fbe_model_value.set(value.second);
        fbe_model_key.fbe_shift(offset_value);
        fbe_model_value.fbe_shift(offset_value);
        size += offset_key + offset_value;
    }
    return size;
}

template <typename TKey, typename TValue>
inline size_t FinalModelMap<TKey, TValue>::set(const std::unordered_map<TKey, TValue>& values) noexcept
{
    assert(((_buffer.offset() + fbe_offset() + 4) <= _buffer.size()) && "Model is broken!");
    if ((_buffer.offset() + fbe_offset() + 4) > _buffer.size())
        return 0;

    *((uint32_t*)(_buffer.data() + _buffer.offset() + fbe_offset())) = (uint32_t)values.size();

    size_t size = 4;
    FinalModel<TKey> fbe_model_key(_buffer, fbe_offset() + 4);
    FinalModel<TValue> fbe_model_value(_buffer, fbe_offset() + 4);
    for (const auto& value : values)
    {
        size_t offset_key = fbe_model_key.set(value.first);
        fbe_model_key.fbe_shift(offset_key);
        fbe_model_value.fbe_shift(offset_key);
        size_t offset_value = fbe_model_value.set(value.second);
        fbe_model_key.fbe_shift(offset_value);
        fbe_model_value.fbe_shift(offset_value);
        size += offset_key + offset_value;
    }
    return size;
}

} // namespace FBE
