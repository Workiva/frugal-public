#
# Autogenerated by Frugal Compiler (3.16.4)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

from thrift.Thrift import TType, TMessageType, TException, TApplicationException

from frugal.util import make_hashable
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol, TProtocol


class PerfRightsOrg(int):
    ASCAP = 1
    BMI = 2
    SESAC = 3
    Other = 4

    _VALUES_TO_NAMES = {
        1: "ASCAP",
        2: "BMI",
        3: "SESAC",
        4: "Other",
    }

    _NAMES_TO_VALUES = {
        "ASCAP": 1,
        "BMI": 2,
        "SESAC": 3,
        "Other": 4,
    }

class Track(object):
    """
    Comments (with an @ symbol) will be added to generated code.
    
    Attributes:
     - title
     - artist
     - publisher
     - composer
     - duration
     - pro
    """
    def __init__(self, title=None, artist=None, publisher=None, composer=None, duration=None, pro=None):
        self.title = title
        self.artist = artist
        self.publisher = publisher
        self.composer = composer
        self.duration = duration
        self.pro = pro

    def read(self, iprot):
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.STRING:
                    self.title = iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.STRING:
                    self.artist = iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 3:
                if ftype == TType.STRING:
                    self.publisher = iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 4:
                if ftype == TType.STRING:
                    self.composer = iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 5:
                if ftype == TType.DOUBLE:
                    self.duration = iprot.readDouble()
                else:
                    iprot.skip(ftype)
            elif fid == 6:
                if ftype == TType.I32:
                    self.pro = PerfRightsOrg(iprot.readI32())
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()
        self.validate()

    def write(self, oprot):
        self.validate()
        oprot.writeStructBegin('Track')
        if self.title is not None:
            oprot.writeFieldBegin('title', TType.STRING, 1)
            oprot.writeString(self.title)
            oprot.writeFieldEnd()
        if self.artist is not None:
            oprot.writeFieldBegin('artist', TType.STRING, 2)
            oprot.writeString(self.artist)
            oprot.writeFieldEnd()
        if self.publisher is not None:
            oprot.writeFieldBegin('publisher', TType.STRING, 3)
            oprot.writeString(self.publisher)
            oprot.writeFieldEnd()
        if self.composer is not None:
            oprot.writeFieldBegin('composer', TType.STRING, 4)
            oprot.writeString(self.composer)
            oprot.writeFieldEnd()
        if self.duration is not None:
            oprot.writeFieldBegin('duration', TType.DOUBLE, 5)
            oprot.writeDouble(self.duration)
            oprot.writeFieldEnd()
        if self.pro is not None:
            oprot.writeFieldBegin('pro', TType.I32, 6)
            oprot.writeI32(self.pro)
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        return

    def __hash__(self):
        value = 17
        value = (value * 31) ^ hash(make_hashable(self.title))
        value = (value * 31) ^ hash(make_hashable(self.artist))
        value = (value * 31) ^ hash(make_hashable(self.publisher))
        value = (value * 31) ^ hash(make_hashable(self.composer))
        value = (value * 31) ^ hash(make_hashable(self.duration))
        value = (value * 31) ^ hash(make_hashable(self.pro))
        return value

    def __repr__(self):
        L = ['%s=%r' % (key, value)
            for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)

class Album(object):
    """
    The IDL provides set, list, and map types for representing collections
    of data.  Our Album struct contains a list of Tracks.
    
    Attributes:
     - tracks
     - duration
     - ASIN
    """
    def __init__(self, tracks=None, duration=None, ASIN=None):
        self.tracks = tracks
        self.duration = duration
        self.ASIN = ASIN

    def read(self, iprot):
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.LIST:
                    self.tracks = []
                    (_, elem0) = iprot.readListBegin()
                    for _ in range(elem0):
                        elem1 = Track()
                        elem1.read(iprot)
                        self.tracks.append(elem1)
                    iprot.readListEnd()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.DOUBLE:
                    self.duration = iprot.readDouble()
                else:
                    iprot.skip(ftype)
            elif fid == 3:
                if ftype == TType.STRING:
                    self.ASIN = iprot.readString()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()
        self.validate()

    def write(self, oprot):
        self.validate()
        oprot.writeStructBegin('Album')
        if self.tracks is not None:
            oprot.writeFieldBegin('tracks', TType.LIST, 1)
            oprot.writeListBegin(TType.STRUCT, len(self.tracks))
            for elem2 in self.tracks:
                elem2.write(oprot)
            oprot.writeListEnd()
            oprot.writeFieldEnd()
        if self.duration is not None:
            oprot.writeFieldBegin('duration', TType.DOUBLE, 2)
            oprot.writeDouble(self.duration)
            oprot.writeFieldEnd()
        if self.ASIN is not None:
            oprot.writeFieldBegin('ASIN', TType.STRING, 3)
            oprot.writeString(self.ASIN)
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        return

    def __hash__(self):
        value = 17
        value = (value * 31) ^ hash(make_hashable(self.tracks))
        value = (value * 31) ^ hash(make_hashable(self.duration))
        value = (value * 31) ^ hash(make_hashable(self.ASIN))
        return value

    def __repr__(self):
        L = ['%s=%r' % (key, value)
            for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)

class PurchasingError(TException):
    """
    Exceptions are converted to the native format for each compiled
    language.
    
    Attributes:
     - message
     - error_code
    """
    def __init__(self, message=None, error_code=None):
        self.message = message
        self.error_code = error_code

    def read(self, iprot):
        iprot.readStructBegin()
        while True:
            (fname, ftype, fid) = iprot.readFieldBegin()
            if ftype == TType.STOP:
                break
            if fid == 1:
                if ftype == TType.STRING:
                    self.message = iprot.readString()
                else:
                    iprot.skip(ftype)
            elif fid == 2:
                if ftype == TType.I16:
                    self.error_code = iprot.readI16()
                else:
                    iprot.skip(ftype)
            else:
                iprot.skip(ftype)
            iprot.readFieldEnd()
        iprot.readStructEnd()
        self.validate()

    def write(self, oprot):
        self.validate()
        oprot.writeStructBegin('PurchasingError')
        if self.message is not None:
            oprot.writeFieldBegin('message', TType.STRING, 1)
            oprot.writeString(self.message)
            oprot.writeFieldEnd()
        if self.error_code is not None:
            oprot.writeFieldBegin('error_code', TType.I16, 2)
            oprot.writeI16(self.error_code)
            oprot.writeFieldEnd()
        oprot.writeFieldStop()
        oprot.writeStructEnd()

    def validate(self):
        return

    def __str__(self):
        return repr(self)

    def __hash__(self):
        value = 17
        value = (value * 31) ^ hash(make_hashable(self.message))
        value = (value * 31) ^ hash(make_hashable(self.error_code))
        return value

    def __repr__(self):
        L = ['%s=%r' % (key, value)
            for key, value in self.__dict__.items()]
        return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

    def __eq__(self, other):
        return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not (self == other)

